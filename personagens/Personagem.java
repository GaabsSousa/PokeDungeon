package personagens;

public abstract class Personagem {
    private String nome;
    private int hpAtual;
    private int hpMaximo;
    private int ataque;
    private int defesa;

        public Personagem(String nome, int hpMaximo, int ataque, int defesa) {
            this.nome = nome;
            this.hpMaximo = hpMaximo;
            this.hpAtual = hpMaximo;
            this.ataque = ataque;
            this.defesa = defesa;
        }

        public abstract int atacar();

        public void receberDano(int dano) {
            int danoReal = dano - this.defesa;
            if (danoReal < 0) {
                danoReal = 0;
            }
            this.hpAtual -= danoReal;
            if (this.hpAtual < 0) {
            this.hpAtual = 0;
            }
        }
    public boolean estaVivo() {
        return this.hpAtual > 0;
    }

    public String barraDeHp() {
        return this.nome + " HP: " + this.hpAtual + "/" + this.hpMaximo;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getHpatual() {return hpAtual;}
    public void setHpatual(int hpatual) {this.hpAtual = hpatual;}

    public int getHpmax() {return hpMaximo;}
    public void setHpmax(int hpmax) {this.hpMaximo = hpmax;}

    public int getAtaque() {return ataque;}
    public void setAtaque(int ataque) {this.ataque = ataque;}

    public int getDefesa() {return defesa;}
    public void setDefesa(int defesa) {this.defesa = defesa;}
}   