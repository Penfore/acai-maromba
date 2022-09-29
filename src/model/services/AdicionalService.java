package services;

import java.util.ArrayList;
import java.util.List;

import entities.Adicional;

public class AdicionalService {
    List<Adicional> listaAdicionais = new ArrayList<>();

    // TODO: Temporário, será trocado por um método para buscar na base de dados
    public List<Adicional> buscarAdicionais(String nomeAdicional) {
        List<Adicional> adicionaisFiltrados = new ArrayList<>();

        if (nomeAdicional.isEmpty())
            adicionaisFiltrados.addAll(this.listaAdicionais);
        else {
            for (int i = 0; i < this.listaAdicionais.size(); i++) {
                Adicional adicional = this.listaAdicionais.get(i);
                if (adicional.getNome().startsWith(nomeAdicional))
                    adicionaisFiltrados.add(adicional);
            }
        }

        return adicionaisFiltrados;
    }
}
