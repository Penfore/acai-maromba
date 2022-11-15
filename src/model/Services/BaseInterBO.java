package model.Services;

import java.util.List;

public interface BaseInterBO<entity> {
	public boolean adicionar(entity e);

	public boolean deletar(entity e);

	public boolean alterar(entity e);

	public entity buscar(entity e);

	public List<entity> listar();
}
