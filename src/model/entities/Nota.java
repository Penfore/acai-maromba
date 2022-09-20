package entities;

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


}
