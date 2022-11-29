package filial;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    static ArrayList<Pedido> listaPedido = new ArrayList<>();
    
    static void menu() {
        
        /* A partir daqui, temos o que seria o nosso menu, com todas as possiveis funcoes da nossa aplicacao. */
        /* Aqui temos as principais: inserir, consultar, remover pedidos e sair da aplicacao. Nao so isso,    */
        /* mas caso o usuario digite uma opcao fora das pre-definidas, ele tera novas tentativas.             */
        
        System.out.println("Bem-vindo a nossa loja, o que vai querer?");
        System.out.println("Digite 1 para inserir novo pedido.");
        System.out.println("Digite 2 para buscar por um pedido existente.");
        System.out.println("Digite 3 para remover um pedido.");
        System.out.println("Digite 4 para sair.");
        Scanner opcaoMenu = new Scanner(System.in);
        int opcao = 5;
        while (opcao > 4) {
            opcao = opcaoMenu.nextInt();
            switch (opcao) {
                case 1 ->
                    inserir();
                case 2 ->
                    buscar();
                case 3 ->
                    remover();
                case 4 ->
                    System.out.println("Obrigado e volte sempre!");
                default ->
                    System.out.println("Essa nao e uma opcao valida! Tente de novo");
            }
        }
    }
    
    static void inserir() {
        
        /* Como o nome sugere, esse metodo e executado sempre que o cliente quer incluir um pedido. */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o ID");
        int pedidoId = input.nextInt();
        Pedido pedido = new Pedido(pedidoId);
        listaPedido.add(pedido);
        System.out.println("Pedido inserido! Voltando ao menu.");
        menu();
    }

    static void buscar() {
        
        /* Caso aperte o 2, ele tera uma lista com todos os pedidos inseridos e pode escolher ver um deles mais a fundo. */
        /* Para evitar uma confusão do usuario, colocamos que o ID que ele digitar vai ser sempre subtraido por 1, para  */
        /* nao ficar contra-intuitivo. Ou seja, 1 = 0, 2 = 1 e por ai vai.                                               */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o numero do pedido que voce deseja achar?");
        int id = input.nextInt() - 1;
        System.out.println(listaPedido.get(id));
        System.out.println("Pedido encontrado! Voltando ao menu.");
        menu();
    }

    static void remover() {
        
        /* Nosso ultimo metodo, o usuario pode remover um pedido, recebendo de antemao uma lista com os index de cada objeto. */
        /* Usamos a mesma logica do metodo anterior, de diminuir sempre o ID em 1 unidade.                                    */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o numero do pedido que voce deseja deletar?");
        int deletarPedido = input.nextInt() - 1;
        listaPedido.remove(deletarPedido);
        System.out.println("Pedido removido! Voltando ao menu.");
        menu();
    }

    public static void main(String[] args) {
        
        /* Nessa parte, e onde comeca o codigo de verdade, comecando com um simples login (senha = 123), caso acerte */
        /* a senha, continuara para o menu, caso contrario recebe um aviso do sistema e a aplicacao fecha.           */
        
        Funcionario f01 = new Funcionario();
        f01.matricula = 123;
        System.out.println("Quem esta acessando o sistema?");
        Scanner username = new Scanner(System.in);
        f01.nome = username.nextLine();
        System.out.println("Ola, " + f01.nome + "! Por favor, informe a senha.");
        Scanner login = new Scanner(System.in);
        System.out.println("Senha:");
        int senha = login.nextInt();
        if (senha == f01.matricula) {
            menu();
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
