package services;

import entities.Pedido;

public class NotaService {
    // TODO: Será alterado futuramente para ser exibido da forma correta
    public void gerarNota(Pedido pedido) {
        System.out.println("Pedido feito por " + pedido.getCliente());
        System.out.println("Na data " + pedido.getDataPedido());
        System.out.println(pedido.getProduto() + " --- x" + pedido.getQuantidade());
        System.out.println("Forma de pagamento " + pedido.getFormaPagamento());
    }
}
