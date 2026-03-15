package dungeon;

import personagens.Heroi;
import personagens.Monstro;
import batalha.Batalha;

public class Dungeon {
    public static void explorar(Heroi heroi) {
        System.out.println("\n🏰" + heroi.getNome() + " entra na masmorra sombria...");
        for (int sala = 1; sala <= 4; sala++) {
            System.out.println("\n==================================");
            System.out.println("||           [  Sala " + sala + " ]        ||");
            System.out.println("==================================");

            Monstro monstroinimigo;

            if (sala == 4) {
                System.out.println("Você sente um ar frio intenso... O chao treme sob seus pés...");
                System.out.println("O CHEFE DA DUNGEON APARECE!");
                monstroinimigo = new Monstro("Dracolich", 180, 20, 8);
            }else {
                monstroinimigo = gerarmonstroaleatorio();
            }

            boolean sobreviveu = Batalha.iniciar(heroi, monstroinimigo);
            if (!sobreviveu) {
                System.out.println("\n" + heroi.getNome() + " foi derrotado na sala " + sala + "...");
                break; 
            } else if (sala == 4) {
                System.out.println("\n🎉 PARABÉNS! Você derrotou o Dracolich e limpou a PokéDungeon!");
            } else {
                System.out.println("\nVocê avança para a próxima porta...");
            }
        }
    }

    private static Monstro gerarmonstroaleatorio() {
        int sorteio = (int) (Math.random() * 4);
        switch (sorteio) {
            case 0:
                return new Monstro("Dragãozinho", 60, 12, 1);
            case 1:
                return new Monstro("Esqueleto", 45, 8, 0);
            case 2:
                return new Monstro("Zumbi Lento", 70, 6, 2);
            default:
                return new Monstro("Aranha Gigante", 35, 14, 0);
        }
    }
}