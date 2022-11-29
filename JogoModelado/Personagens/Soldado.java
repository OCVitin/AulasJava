package Personagens;

import java.util.Scanner;

public class Soldado extends Personagem{
    
    @Override
    public void desenhar(){
        System.out.println("Os soldados marcham!");
    }
    
    @Override
    public void falar(){
        System.out.println("Soldado: Senhor, sim senhor!");
    }
    
    @Override
    public void arma(){
        System.out.println("Usar a arma equipada");
    }
    
    @Override
    public void setArma(){
        System.out.println("Escolha a arma do soldado:");
        System.out.println("0 para fuzil");
        System.out.println("1 para desarmado");
        System.out.println("2 para revolver");
        System.out.println("3 para faca");
        Scanner opcaoMenu = new Scanner(System.in);
        int opcao = 4;
        while (opcao > 3) {
            opcao = opcaoMenu.nextInt();
            switch (opcao) {
                case 0 -> {
                    Armas.Fuzil arma = new Armas.Fuzil();
                    arma.dano = 2;
                    arma.alcance = 30;
                    arma.cadencia = 10;
                    System.out.println("Fuzil equipado");
                    arma.usarArma();
                }
                case 1 -> {
                    Armas.Maos arma = new Armas.Maos();
                    arma.dano = 5;
                    arma.alcance = 1;
                    arma.cadencia = 5;
                    System.out.println("Desarmado");
                    arma.usarArma();
                }
                case 2 -> {
                    Armas.Revolver arma = new Armas.Revolver();
                    arma.dano = 7;
                    arma.alcance = 25;
                    arma.cadencia = 5;
                    System.out.println("Revolver equipado");
                    arma.usarArma();
                }
                case 3 -> {
                    Armas.Faca arma = new Armas.Faca();
                    arma.dano = 10;
                    arma.alcance = 1;
                    arma.cadencia = 5;
                    System.out.println("Faca equipada");
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