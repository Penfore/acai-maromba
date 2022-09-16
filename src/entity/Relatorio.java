package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {

    Relatorio(List<Pedido> pedidos, LocalDate dataInicial, LocalDate dataFinal) {
        for (int i = 0; i <= (pedidos.size() - 1); i++) {
            gerarRelatorio(dataInicial, dataFinal, pedidos.get(i));
        }
    }

    private List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // A ideia é que seja setado os pedidos através do método gerarRelatorio()
    // Por isso o método setPedidos é privado
    private void setPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    // Irá realizar uma busca na base de dados e salvar todos os pedidos que estejam
    // entre o intervalo de tempo passado para o método na chamada
    // Por enquanto tem uma lógica simples apenas para servir de exemplo
    public void gerarRelatorio(LocalDate dataInicial, LocalDate dataFinal, Pedido pedidoVerificado) {
        if (pedidoVerificado.getDataPedido().isAfter(dataInicial)
                && pedidoVerificado.getDataPedido().isBefore(dataFinal))
            setPedidos(pedidoVerificado);
        else
            System.out.println("Não adicionado. Passar para o próximo");
    }
}
