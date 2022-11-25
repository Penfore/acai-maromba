package model.entities;

public class Pedido {
    Pedido(String dataPedido, Cliente cliente, int quantidade, Produto produto, FormaPagamento formaPagamento) {
        setDataPedido(dataPedido);
        setCliente(cliente);
        setQuantidade(quantidade);
        setProduto(produto);
        setFormaPagamento(formaPagamento);
    }

    public Pedido() {
        this.dataPedido = "";
        this.cliente = new Cliente();
        this.quantidade = 0;
        this.produto = new Produto();
        this.formaPagamento = "";
    }

    private String dataPedido;
    private Cliente cliente;
    private int quantidade;
    private Produto produto;
    private String formaPagamento;
    private int id;

    // Setters
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID invalido!");
        }
    }

    public void setDataPedido(String novaDataPedido) {
        if (dataPedido != null)
            this.dataPedido = novaDataPedido;
        else
            this.dataPedido = "";
    }

    public void setCliente(Cliente novoCliente) {
        if (cliente != null)
            this.cliente = novoCliente;
        else
            this.cliente = new Cliente(); // empty
    }

    public void setQuantidade(int novaQuantidade) {
        if (quantidade > 0)
            this.quantidade = novaQuantidade;
        else
            this.quantidade = 300;
    }

    public void setProduto(Produto novoProduto) {
        if (novoProduto != null)
            this.produto = novoProduto;
        else
            this.produto = new Produto(); // empty
    }

    public void setFormaPagamento(String formaPagamento) {
        if (formaPagamento != null)
            this.formaPagamento = formaPagamento;
        else
            this.formaPagamento = "";
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    // Cleaners
    public void clearDataPedido() {
        this.dataPedido = "";
    }

    public void clearCliente() {
        this.cliente = new Cliente();
    }

    public void clearQuantidade() {
        this.quantidade = 0;
    }

    public void clearFormaPagament() {
        this.formaPagamento = "";
    }

}
