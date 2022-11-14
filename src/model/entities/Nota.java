package model.entities;

public class Nota {
    private Pedido pedido;
    private int id;

    Nota(Pedido pedido) {
        setPedido(pedido);
    }

    public Nota() {
        this.pedido = new Pedido(); // empty
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido != null)
            this.pedido = pedido;
        else
            this.pedido = new Pedido(); // empty
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID invalido!");
        }
    }

}
