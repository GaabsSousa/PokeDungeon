package personagens;

public class Mago extends Heroi {
    public Mago(String nome) {
        super(nome, 80, 25, 4);
    }

    @Override
    public int atacar() {
        System.out.println(getNome() + " lança um raio arcano!");
        return getAtaque();
    }

    @Override
    public int usarHabilidade() {
        System.out.println(getNome() + " usa sua habilidade especial: Bola de Fogo!");
        return getAtaque() * 2;
    }
}