package Personagens;

public abstract class Personagem {
    public int pontosVida;

    public Personagem() {
    }
    public Personagem(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    
    protected abstract void desenhar();
    protected abstract void falar();
    public abstract void arma();
    public abstract void setArma();
}