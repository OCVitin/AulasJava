package Personagens;
        
import java.util.Scanner;

public class DragaoAlado extends Personagem {
        
    @Override
    public void desenhar(){
        System.out.println("Um monstro lendário surge aos céus!");
    }
    
    @Override
    public void falar(){
        System.out.println("Dragão: GRRRRRR");
    }
    
    @Override
    public void arma(){
        System.out.println("Usar a arma equipada");
    }
    
    @Override
    public void setArma(){
        System.out.println("Escolha a arma do dragão:");
        System.out.println("0 para desarmado");
        System.out.println("1 para fogo");
        Scanner opcaoMenu = new Scanner(System.in);
        int opcao = 2;
        while (opcao > 1) {
            opcao = opcaoMenu.nextInt();
            switch (opcao) {
                case 0 -> {
                    Armas.Maos arma = new Armas.Maos();
                    arma.dano = 5;
                    arma.alcance = 1;
                    arma.cadencia = 5;
                    System.out.println("Desarmado");
                    arma.usarArma();
                }
                case 1 -> {
                    Armas.LancarChamas arma = new Armas.LancarChamas();
                    arma.dano = 10;
                    arma.alcance = 15;
                    arma.cadencia = 1;
                    System.out.println("Chamas");
                    arma.usarArma();
                }
                default -> System.out.println("Essa nao e uma opcao valida! Tente de novo");
            }
        }
    }
    
    public void voar(){
        System.out.println("Levantar Voo");
    }
}
