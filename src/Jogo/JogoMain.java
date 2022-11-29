package Jogo;
import java.util.Scanner;

public class JogoMain {
    
    public static void main(String[] args){
        System.out.println("Escolha um personagem!");
        System.out.println("Digite 0 para general");
        System.out.println("Digite 1 para soldado");
        System.out.println("Digite 2 para lutador de sumo");
        System.out.println("Digite 3 para DragaoAlado");
        System.out.println("Digite 4 para MagoSupremo");
        Scanner opcaoMenu = new Scanner(System.in);
        int opcao = 5;
        while (opcao > 4) {
            opcao = opcaoMenu.nextInt();
            switch (opcao) {
                case 0 -> {Personagens.General perso = new Personagens.General();
                perso.pontosVida = 10;
                perso.desenhar();
                perso.falar();
                perso.setArma();
                perso.arma();
                perso.correr();
                }
                case 1 -> {Personagens.Soldado perso = new Personagens.Soldado();
                perso.pontosVida = 7;
                perso.desenhar();
                perso.falar();
                perso.setArma();
                perso.arma();
                perso.correr();
                }
                case 2 -> {Personagens.LutSUMO perso = new Personagens.LutSUMO();
                perso.pontosVida = 15;
                perso.desenhar();
                perso.falar();
                perso.setArma();
                perso.arma();
                }
                case 3 -> {Personagens.DragaoAlado perso = new Personagens.DragaoAlado();
                perso.pontosVida = 20;
                perso.desenhar();
                perso.falar();
                perso.setArma();
                perso.voar();
                perso.arma();
                }
                case 4 -> {Personagens.MagoSupremo perso = new Personagens.MagoSupremo();
                perso.pontosVida = 6;
                perso.desenhar();
                perso.falar();
                perso.setArma();
                perso.arma();
                perso.correr();
                }
                default -> System.out.println("Essa nao e uma opcao valida! Tente de novo");
            }
        }
        
    }
}