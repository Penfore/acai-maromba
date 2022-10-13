import dao.ClienteDao;
import dao.ConnectionFactory;
import entities.Cliente;
import entities.Endereco;

public class Main {
    public static void main(String args[]) {
        // if (ClienteService.adicionar(cliente)) {
        // System.out.println("Usuário adicionado com sucesso");
        // }

        ConnectionFactory dao = new ConnectionFactory();
        System.out.println(dao.getConnection());

        ClienteDao clienteDao = new ClienteDao();

        // Cliente cliente = new Cliente(
        // "Juininho Doido",
        // new Endereco("Brasil", "Rio Grande do Norte", "Mossoró", "Rua da Doidera",
        // "666"),
        // "84994531843");

        Cliente cliente = new Cliente();
        cliente.setNome("Juininho Doido 2");

        Endereco endereco = new Endereco();
        endereco.setPais("Brasil");
        endereco.setEstado("Rio Grande do Norte");
        endereco.setCidade("Mossoró");
        endereco.setLogradouro("Rua da Doidera");
        endereco.setNumero("666");

        cliente.setEndereco(endereco);
        cliente.setTelefone("84994531843");
        cliente.setId(10);

        clienteDao.alterar(cliente);

        // clienteDao.adicionar(cliente);

        // List<Cliente> clientes = clienteDao.listar();

        // for (Cliente clienteListar : clientes) {
        //     System.out.println(clienteListar.getNome());
        // }
    }
}
