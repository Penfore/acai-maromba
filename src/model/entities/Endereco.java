package model.Entities;

public class Endereco {
    public Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
        setPais(pais);
        setEstado(estado);
        setCidade(cidade);
        setLogradouro(logradouro);
        setNumero(numero);
    }

    public Endereco() {
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
        if (pais != null && !pais.isEmpty())
            this.pais = novoPais;
        else
            this.pais = "Valor não válido";
    }

    public void setEstado(String novoEstado) {
        if (estado != null && !estado.isEmpty())
            this.estado = novoEstado;
        else
            this.estado = "Valor não válido";
    }

    public void setCidade(String novaCidade) {
        if (cidade != null && !cidade.isEmpty())
            this.cidade = novaCidade;
        else
            this.cidade = "Valor não válido";
    }

    public void setLogradouro(String novoLogradouro) {
        if (logradouro != null && !logradouro.isEmpty())
            this.logradouro = novoLogradouro;
        else
            this.logradouro = "Valor não válido";
    }

    public void setNumero(String novoNumero) {
        if (numero != null && !numero.isEmpty())
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
