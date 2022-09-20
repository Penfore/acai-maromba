package services;

import java.time.LocalDate;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;

public class PedidoService {
    // Buscadores // TODO: Implementar buscadores
    public Pedido buscarPedidoData(LocalDate dataBusca) {
        return new Pedido();
    }

    public Pedido buscarPedidoCliente(Cliente cliente) {
        return new Pedido();
    }

    public Pedido buscarPedidoProduto(Produto produto) {
        return new Pedido();
    }
}
