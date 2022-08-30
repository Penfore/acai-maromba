package entity;

public class Endereco {
    Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
        if (!pais.isEmpty() && pais != null)
            this.pais = pais;
        if (!estado.isEmpty() && estado != null)
            this.estado = estado;
        if (!cidade.isEmpty() && cidade != null)
            this.cidade = cidade;
        if (!logradouro.isEmpty() && logradouro != null)
            this.logradouro = logradouro;
        if (!numero.isEmpty() && numero != null)
            this.numero = numero;
    }

    Endereco() {
        this.pais = "";
        this.estado = "";
        this.cidade = "";
        this.logradouro = "";
        this.numero = "";
    }

    private String pais;
    private String estado;
    private String cidade;
    private String logradouro;
    private String numero;

    public void setPais(String novoPais) {
        this.pais = novoPais;
    }

    public void setEstado(String novoEstado) {
        this.estado = novoEstado;
    }

    public void setCidade(String novaCidade) {
        this.cidade = novaCidade;
    }

    public void setLogradouro(String novoLogradouro) {
        this.logradouro = novoLogradouro;
    }

    public void setNumero(String novoNumero) {
        this.numero = novoNumero;
    }

    public String getPais() {
        return this.pais;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void clearPais() {
        this.pais = "";
    }

    public void clearEstado() {
        this.estado = "";
    }

    public void clearCidade() {
        this.cidade = "";
    }

    public void clearLogradouro() {
        this.logradouro = "";
    }

    public void clearNumero() {
        this.numero = "";
    }
}
