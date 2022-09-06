package entity;

import java.time.LocalDate;

public class Pedido {
    Pedido(
            LocalDate dataPedido,
            Cliente cliente,
            int quantidade,
            Produto produto,
            FormaPagamento formaPagamento) {
        setDataPedido(dataPedido);
        setCliente(cliente);
        setQuantidade(quantidade);
        setProduto(produto);
        setFormaPagamento(formaPagamento);
    }

    Pedido() {
        this.dataPedido = LocalDate.now();
        this.cliente = new Cliente();
        this.quantidade = 0;
        this.produto = new Produto();
        this.formaPagamento = FormaPagamento.VAZIO;
    }

    private LocalDate dataPedido;
    private Cliente cliente;
    private int quantidade;
    private Produto produto;
    private FormaPagamento formaPagamento;

    // Setters
    public void setDataPedido(LocalDate novaDataPedido) {
        if (dataPedido != null)
            this.dataPedido = novaDataPedido;
        else
            this.dataPedido = LocalDate.now();
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

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        if (formaPagamento != null)
            this.formaPagamento = formaPagamento;
        else
            this.formaPagamento = FormaPagamento.VAZIO;
    }

    // Getters
    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    // Cleaners
    public void clearDataPedido() {
        this.dataPedido = LocalDate.now();
    }

    public void clearCliente() {
        this.cliente = new Cliente();
    }

    public void clearQuantidade() {
        this.quantidade = 0;
    }

    public void clearFormaPagament() {
        this.formaPagamento = FormaPagamento.VAZIO;
    }

    // Buscadores // TODO: Implementar buscadores
    public Pedido buscarPedidoData(LocalDate dataBusca) {
        return new Pedido();
    }

    public Pedido buscarPedidoCliente(Cliente cliente) {
        return new Pedido();
    }

    public Pedido buscarPedidoProduto(/* Produto produto */) {
        return new Pedido();
    }
}
