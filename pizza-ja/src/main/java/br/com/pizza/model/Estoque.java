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

import lombok.Data;

/*Class Estoque*/

@Entity
@Data
public class Estoque implements Serializable{

	/**
	 * Atributos da class Estoque
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer quantidade;
	@OneToMany
	@JoinTable(name = "estoque_produtos")
	private List<Produto> produtos;
	
	// instancias da lista produtos
	
	public Estoque() {
		this.produtos = new ArrayList<Produto>();
	}
}
