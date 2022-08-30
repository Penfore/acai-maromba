package entity;

public class Endereco {
    Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
        if (!pais.isEmpty() && pais != null)
            this.pais = pais;
        else
            this.pais = "Valor não válido";
        if (!estado.isEmpty() && estado != null)
            this.estado = estado;
        else
            this.estado = "Valor não válido";
        if (!cidade.isEmpty() && cidade != null)
            this.cidade = cidade;
        else
            this.cidade = "Valor não válido";
        if (!logradouro.isEmpty() && logradouro != null)
            this.logradouro = logradouro;
        else
            this.logradouro = "Valor não válido";
        if (!numero.isEmpty() && numero != null)
            this.numero = numero;
        else
            this.numero = "Valor não válido";
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
        if (!pais.isEmpty() && pais != null)
            this.pais = novoPais;
        else
            this.pais = "Valor não válido";
    }

    public void setEstado(String novoEstado) {
        if (!estado.isEmpty() && estado != null)
            this.estado = novoEstado;
        else
            this.estado = "Valor não válido";
    }

    public void setCidade(String novaCidade) {
        if (!cidade.isEmpty() && cidade != null)
            this.cidade = novaCidade;
        else
            this.cidade = "Valor não válido";
    }

    public void setLogradouro(String novoLogradouro) {
        if (!logradouro.isEmpty() && logradouro != null)
            this.logradouro = novoLogradouro;
        else
            this.logradouro = "Valor não válido";
    }

    public void setNumero(String novoNumero) {
        if (!numero.isEmpty() && numero != null)
            this.numero = novoNumero;
        else
            this.numero = "Valor não válido";
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
