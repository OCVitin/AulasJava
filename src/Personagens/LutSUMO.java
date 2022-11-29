package Personagens;

public class LutSUMO extends Personagem{
    
    @Override
    public void desenhar(){
        System.out.println("Um novo oponente sobe ao ringue!");
    }
    
    @Override
    public void falar(){
        System.out.println("Sumo: O primeiro a sair do tatame, perde!");
    }
    
    @Override
    public void arma(){
        System.out.println("Usar a arma equipada");
    }
    
    @Override
    public void setArma(){
        Armas.Maos arma = new Armas.Maos();
        arma.dano = 5;
        arma.alcance = 1;
        arma.cadencia = 5;
        System.out.println("Desarmado (automatico)");
        arma.usarArma();
    }
}