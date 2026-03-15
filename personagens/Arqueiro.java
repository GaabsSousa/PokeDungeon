package personagens;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome) {
        super(nome, 100, 18, 6);
    }

        @Override
        public int atacar() {
            System.out.println(getNome() + " dispara uma flecha rápida!");
            return getAtaque();
        }

        @Override
        public int usarHabilidade() {
            System.out.println(getNome() + " usa sua habilidade especial: Tiro certeiro!");
            if (Math.random() < 0.8) {
                System.out.println("Dano Crítico!");
                return getAtaque() * 3;
            } else {
                System.out.println("Pegou de raspão...");
                return getAtaque();
            }
        }
    }
