package br.com.pizza.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/*Class Usuario*/

@Entity
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf
				+ ", enderecos=" + enderecos + ", pedidos=" + pedidos + "]";
	}

}
