package entity;

public class Cliente {
    Cliente(String nome, Endereco endereco, String telefone) {
        if (!nome.isEmpty() && nome != null)
            this.nome = nome;
        if (endereco != null)
            this.endereco = endereco;
        if (!telefone.isEmpty() && telefone != null)
            this.telefone = telefone;
    }

    Cliente() {
        this.nome = "";
        this.endereco = new Endereco();
        this.telefone = "";
    }

    private String nome;
    private Endereco endereco;
    private String telefone;

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
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
}
