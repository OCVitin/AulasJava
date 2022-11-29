package filial;

import java.util.Scanner;
public class Pedido {
    int pedidoId;
    String dataEmissao; /* Infelizmente, nao conseguimos utilizar o Date, então deixamos como Sring */
    float valorTotal;

    public Pedido(int pedidoId) {
        this.pedidoId = pedidoId;
        Scanner novoPedido = new Scanner(System.in);
        System.out.println("Insira o valor");
        valorTotal = novoPedido.nextFloat();
        System.out.println("Insira a data de emissão");
        dataEmissao = novoPedido.next();
    }

    public Pedido(int pedidoId, String dataEmissao, float valorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotalCalculado;
    }
}