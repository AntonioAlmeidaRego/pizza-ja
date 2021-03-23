package br.com.pizza.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Data;

/*Class Usuario*/

@Entity
@Data
public class Usuario implements Serializable {

	/**
	 * Atributos da class Usuario
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	@OneToMany
	@JoinTable(name = "usuario_enderecos")
	private List<Endereco> enderecos;
	@OneToMany
	@JoinTable(name = "usuario_pedidos")
	private List<Pedido> pedidos;
	
	// instancias de listas
	
	public Usuario() {
		this.enderecos = new ArrayList<Endereco>();
		this.pedidos = new ArrayList<Pedido>();
	}
}
