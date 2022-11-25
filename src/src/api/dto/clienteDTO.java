package api.dto;

public class clienteDTO {
	private String nome;
	private String telefone;
	private enderecoDTO enderecoDTO;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public enderecoDTO getEnderecoDTO() {
		return enderecoDTO;
	}
	public void setEnderecoDTO(enderecoDTO enderecoDTO) {
		this.enderecoDTO = enderecoDTO;
	}



}
