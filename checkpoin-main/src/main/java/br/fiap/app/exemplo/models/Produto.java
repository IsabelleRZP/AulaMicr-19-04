package br.fiap.app.exemplo.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity //cria entidade
public class Produto {
	
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private Long id; 
	
	@NotBlank(message = "Favor preenchr o nome do prduto")		
	private String nome;
	
	@NotNull(message = "O fornecedor é obrigatório!")
	@Min(value = 1, message = "Favor seçlecionar o fornecedor")
	private Long idFornecedor; 
	
	private Long idCategoria;
	
	// @Pattern(regexp = "[0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2}")
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public Long getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
}
