import entities.Cliente;
import entities.Endereco;
import services.ClienteService;

public class Main {
    public static void main(String args[]) {
        Cliente cliente = new Cliente(
                "Juininho Doido",
                new Endereco("Brasil", "Rio Grande do Norte", "Mossoró", "Rua da Doidera", "666"),
                "(84)994531843");

        if (ClienteService.adicionar(cliente)) {
            System.out.println("Usuário adicionado com sucesso");
        }
    }
}
