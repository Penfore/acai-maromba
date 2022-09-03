public class Produto {
    private String nome;
    private double preco;
    private Adicionais adicionais;

    // Getters

    public Adicionais getAdicionais() {
        return adicionais;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty())
            this.nome=nome;
        else 
            this.nome = "Valor não válido";
    }

    public void setPreco(double preco) {
        if (preco > 0 && preco <= 2000.0)
            this.preco = preco;
        else
            this.preco = 2000.0;
    }

    public void setAdicionais(Adicionais adicionais) {
        this.adicionais = adicionais;
    }
    
    // Construtor

    Produto(String nome, double preco, Adicionais adicionais){
        if (nome != null && !nome.isEmpty())
            this.nome=nome;
        else 
            this.nome = "Valor não válido";
        if (preco > 0 && preco <= 200.0)
            this.preco = preco;
        else
            this.preco = 200.0;
    }

    // Clear

    public void limparNome(){
        this.nome = "";
    }

    public void limparPreco(){
        this.preco = 0.0;
    }

    public void limparAdicional(){
        this.adicionais = null;
    }

}