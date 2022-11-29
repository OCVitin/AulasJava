package Personagens;

import java.util.Scanner;

public class MagoSupremo extends Personagem {
        
    @Override
    public void desenhar(){
        System.out.println("O mago é implacável!");
    }
    
    @Override
    public void falar(){
        System.out.println("Mago: Eu sou implacável.");
    }
    
    @Override
    public void arma(){
        System.out.println("Usar a arma equipada");
    }
    
    @Override
    public void setArma(){
        System.out.println("Escolha a arma do mago:");
        System.out.println("0 para desarmado");
        System.out.println("1 para cajado");
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
                    Armas.CajadoMagico arma = new Armas.CajadoMagico();
                    arma.dano = 10;
                    arma.alcance = 10;
                    arma.cadencia = 2;
                    System.out.println("Cajado equipado");
                    arma.usarArma();
                }
                default -> System.out.println("Essa nao e uma opcao valida! Tente de novo");
            }
        }
    }
    
    public void correr(){
        System.out.println("O personagem corre");
    }
}
