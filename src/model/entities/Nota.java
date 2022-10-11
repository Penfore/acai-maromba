package model.Entities;

public class Nota {
    Nota(Pedido pedido) {
        setPedido(pedido);
    }

    public Nota() {
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
