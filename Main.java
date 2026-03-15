import personagens.Arqueiro;
import personagens.Guerreiro;
import personagens.Heroi;
import personagens.Mago;
import dungeon.Dungeon;
import util.EntradaUsuario;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("=================================================");
        System.out.println("  _____     _    __  ___                               ");
        System.out.println(" |  __ \\   | |  / / |__ \\                              ");
        System.out.println(" | |__) |__| | / /_    ) |                             ");
        System.out.println(" |  ___/ _ \\ |/ / _ \\ / /                              ");
        System.out.println(" | |  | (_) |  <  __// /_                              ");
        System.out.println(" |_|   \\___/|_|\\_\\___|____| Dungeon                    ");
        System.out.println("=================================================");
        System.out.println("Bem-vindo à Dungeon! Você voltará com vida? ~~~");

        String nomeHeroi = EntradaUsuario.lerString("\nDigite o nome do seu herói: ");

        Heroi heroi = null;
        boolean classeValida = false;

        while (!classeValida) {
            System.out.println("\nEscolha sua classe:");
            System.out.println("[1] Guerreiro");
            System.out.println("[2] Mago");
            System.out.println("[3] Arqueiro");

            int escolha = EntradaUsuario.lerInteiro("\n>> ");

            switch (escolha) {
                case 1:
                    heroi = new Guerreiro(nomeHeroi);
                    classeValida = true;
                    break;
                case 2:
                    heroi = new Mago(nomeHeroi);
                    classeValida = true;
                    break;
                case 3:
                    heroi = new Arqueiro(nomeHeroi);
                    classeValida = true;
                    break;
                default:
                    System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                    break;
            }
        }

        Dungeon.explorar(heroi);

        EntradaUsuario.fechar();
        
        System.out.println("\nObrigado por jogar PokéDungeon!");
    }
}