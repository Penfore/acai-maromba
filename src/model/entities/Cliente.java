package entities;

public class Cliente {
    public Cliente(String nome, Endereco endereco, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public Cliente() {
        this.nome = "";
        this.endereco = new Endereco();
        this.telefone = "";
    }

    private String nome;
    private Endereco endereco;
    private String telefone;

    // Setters
    public void setNome(String novoNome) {
        if (nome != null && !novoNome.isEmpty())
            this.nome = novoNome;
        else
            this.nome = "Valor não válido";
    }

    public void setEndereco(Endereco novoEndereco) {
        if (novoEndereco == null)
            this.endereco = new Endereco(); // Empty
        else
            this.endereco = novoEndereco;
    }

    public void setTelefone(String novoTelefone) {
        if (novoTelefone != null && novoTelefone.isEmpty())
            this.telefone = novoTelefone;
        else
            this.telefone = "Valor não válido";
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // Cleaners
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