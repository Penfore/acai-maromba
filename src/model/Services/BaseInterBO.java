package model.Services;

public interface BaseInterBO<entity> {
	
	public boolean adicionar (entity e);
	public boolean apagar (entity e);
	public boolean atualizar (entity e);
	public boolean buscar (entity e);
	
	
}
