package entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    Cliente(String nome, Endereco endereco, String telefone) {
        if (nome != null && !nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Valor não válido";
        if (endereco != null)
            this.endereco = endereco;
        if (telefone != null && !telefone.isEmpty())
            this.telefone = telefone;
        else
            this.telefone = "Valor não válido";
    }

    Cliente() {
        this.nome = "";
        this.endereco = new Endereco();
        this.telefone = "";
    }

    private String nome;
    private Endereco endereco;
    private String telefone;
    List<Cliente> listaClientes = new ArrayList<>();

    public void setNome(String novoNome) {
        if (nome != null && !novoNome.isEmpty())
            this.nome = novoNome;
        else
            this.nome = "Valor não válido";
    }

    public void setEndereco(Endereco novoEndereco) {
        if (novoEndereco == null)
            this.endereco = new Endereco();
        else
            this.endereco = novoEndereco;
    }

    public void setTelefone(String novoTelefone) {
        if (novoTelefone != null && novoTelefone.isEmpty())
            this.telefone = novoTelefone;
        else
            this.telefone = "Valor não válido";
    }

    public String getNome() {
        return this.nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void clearNome() {
        this.nome = "";
    }

    public void clearEndereco() {
        this.endereco.clearPais();
        this.endereco.clearEstado();
        this.endereco.clearCidade();
        this.endereco.clearLogradouro();
        this.endereco.clearNumero();
    }

    public void clearTelefone() {
        this.telefone = "";
    }

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
