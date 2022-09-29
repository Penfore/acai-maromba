package services;

import dao.ClienteDao;
import entities.Cliente;

public class ClienteService {
    static ClienteDao dao = new ClienteDao();

    public static Cliente buscar(Cliente cliente) {
        Cliente clienteBuscado = dao.buscar(cliente);
        if (clienteBuscado != null) {
            return clienteBuscado;
        } else
            return null;
    }

    public static boolean adicionar(Cliente cliente) {
        if (dao.buscar(cliente) == null) {
            return dao.adicionar(cliente);
        } else
            return false;
    }

    public static boolean alterar(Cliente cliente) {
        if (dao.buscar(cliente) != null) {
            return dao.alterar(cliente);
        } else
            return false;
    }

    public static boolean deletar(Cliente cliente) {
        if (dao.buscar(cliente) != null) {
            return dao.deletar(cliente);
        } else
            return false;
    }
}
