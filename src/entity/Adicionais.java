import java.util.ArrayList;
import java.util.List;

public class Adicionais {
    private String nome;
    private double preco;
    List<Adicionais> listaAdicionais = new ArrayList<>();

    Adicionais(String nome, double preco){
        if (nome != null && !nome.isEmpty())
            this.nome=nome;
        else 
            this.nome = "Valor não válido";
        if (preco > 0 && preco <= 200.0)
            this.preco = preco;
        else
            this.preco = 200.0;
    }

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
            this.nome=nome;
        else 
            this.nome = "Valor não válido";
    }

    public void setPreco(double preco) {
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

    public List<Adicionais> buscarAdicionais(String nomeAdicional) {
        List<Adicionais> adicionaisFiltrados = new ArrayList<>();

        if (nomeAdicional.isEmpty())
            adicionaisFiltrados.addAll(this.listaAdicionais);
        else {
            for (int i = 0; i < this.listaAdicionais.size(); i++) {
                Adicionais adicional = this.listaAdicionais.get(i);
                if (adicional.getNome().startsWith(nomeAdicional))
                    adicionaisFiltrados.add(adicional);
            }
        }

        return adicionaisFiltrados;
    }


}