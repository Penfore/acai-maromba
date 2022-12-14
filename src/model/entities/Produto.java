package model.entities;


public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String id;

    // Getters

    

    

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters

    

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Valor não válido";
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
        else
            this.preco = 2000.0;
    }

    

    // Construtor

    Produto(String nome, double preco, Adicional adicionais) {
        if (nome != null && !nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Valor não válido";
        if (preco > 0)
            this.preco = preco;
        else
            this.preco = 200.0;
    }

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }

    // Clear

    public void limparNome() {
        this.nome = "";
    }

    public void limparPreco() {
        this.preco = 0.0;
    }

    public void limparQuantidade() {
        this.quantidade = 0;
    }



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
