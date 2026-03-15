package personagens;

public class Guerreiro extends Heroi {
    public Guerreiro(String nome) {
        super(nome, 120, 15, 10);
    }

    @Override
    public int atacar() {
        System.out.println(getNome() + " ataca com sua espada pesada!");
        return getAtaque();
    }

    @Override
    public int usarHabilidade() {
        System.out.println(getNome() + " usa sua habilidade especial: Golpe Devastador!");
        return getAtaque() * 2;
    }
}