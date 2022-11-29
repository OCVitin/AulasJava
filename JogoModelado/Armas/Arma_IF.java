package Armas;

public abstract class Arma_IF {
    public int dano;
    public int alcance;
    public int cadencia;
    
    public Arma_IF() {
        
    }
    public Arma_IF(int dano, int alcance, int cadencia) {
        this.dano = dano;
        this.alcance = alcance;
        this.cadencia = cadencia;
    }
    
    public abstract void usarArma();
}