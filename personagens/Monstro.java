package personagens;

public class Monstro extends Personagem {
    public Monstro(String nome, int hpMaximo, int ataque, int defesa) {
        super(nome, hpMaximo, ataque, defesa);
    }

    @Override
    public int atacar() {
        return getAtaque();
    }
}