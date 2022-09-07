package entity;

public class Nota {
    Nota(Pedido pedido) {
        setPedido(pedido);
    }

    Nota() {
        this.pedido = new Pedido(); // empty
    }

    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido != null)
            this.pedido = pedido;
        else
            this.pedido = new Pedido(); // empty
    }

    // Será alterado futuramente para ser exibido da forma correta
    public void gerarNota(Pedido pedido) {
        System.out.println("Pedido feito por " + pedido.getCliente());
        System.out.println("Na data " + pedido.getDataPedido());
        System.out.println(pedido.getProduto() + " --- x" + pedido.getQuantidade());
        System.out.println("Forma de pagamento " + pedido.getFormaPagamento());
    }
}
