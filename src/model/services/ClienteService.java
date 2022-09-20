package services;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;

public class ClienteService {
    List<Cliente> listaClientes = new ArrayList<>();

    // Temporário, será trocado por um método para buscar na base de dados
    public List<Cliente> buscarCliente(String nomeBusca) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        if (nomeBusca.isEmpty())
            clientesFiltrados.addAll(this.listaClientes);
        else {
            for (int i = 0; i < this.listaClientes.size(); i++) {
                Cliente cliente = this.listaClientes.get(i);
                if (cliente.getNome().startsWith(nomeBusca))
                    clientesFiltrados.add(cliente);
            }
        }

        return clientesFiltrados;
    }
}
