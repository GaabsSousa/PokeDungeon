package batalha;

import personagens.Heroi;
import personagens.Mago;
import personagens.Monstro;
import util.EntradaUsuario;

public class Batalha {

    public static boolean iniciar(Heroi heroi, Monstro monstro) {
        int turno = 1;
        int turnosqueimadura = 0;

        System.out.println("\n[ Um " + monstro.getNome() + " aparece das sombras! ]\n");

        while (heroi.estaVivo() && monstro.estaVivo()) {
            System.out.println("\n=== Turno " + turno + " ===");
            System.out.printf("%s HP: %s\n", heroi.getNome(), heroi.barraDeHp());
            System.out.printf("%s HP: %s\n", monstro.getNome(), monstro.barraDeHp());

            if (turnosqueimadura > 0 && monstro.estaVivo()) {
                System.out.println("🔥 O " + monstro.getNome() + "sofre dano por queimadura!");
                monstro.receberDano(5);
                turnosqueimadura--;
            }
        

            if (!monstro.estaVivo()) {
                break;
            }

            System.out.println("\nEscolha sua ação:");
            System.out.println("[1] Atacar (ATK: " + heroi.getAtaque() + ")");
            System.out.println("[2] Usar Habilidade Especial");
            System.out.println("[3] Fugir");

            int escolha = EntradaUsuario.lerInteiro(">> ");
            int danoCausado = 0;

            switch (escolha) {
                case 1:
                    danoCausado = heroi.atacar();
                    monstro.receberDano(danoCausado);
                    System.out.println("Você causou " + danoCausado + " de dano!");
                    break;
                case 2:
                    danoCausado = heroi.usarHabilidade();
                    monstro.receberDano(danoCausado);
                    System.out.println("Você causou " + danoCausado + " de dano!");

                    if (heroi instanceof Mago) {
                        turnosqueimadura = 3;
                    }
                    break;
                case 3:
                    System.out.println(heroi.getNome() + " fugiu da batalha!");
                    return false;
                default:
                    System.out.println("Opção inválida! Você perdeu seu turno.");
                    break;
            }
            if (monstro.estaVivo()) {
                System.out.println("\n--- Turno do inimigo ---");
                int danoMonstro = monstro.atacar();
                heroi.receberDano(danoMonstro);
                System.out.println("O " + monstro.getNome() + " causou " + danoMonstro + " de dano em você!");
            }
            turno++;
        }
            if (heroi.estaVivo()) {
            System.out.println("\n🏆 você derrotou o " + monstro.getNome() + "!");
            return true;
            } else {
            System.out.println("\n💀 você foi derrotado pelo " + monstro.getNome() + "...");
            return false;
        }
    }
}
