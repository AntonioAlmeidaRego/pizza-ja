package br.com.pizza.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/*Class Pedido*/

@Entity
@Data
public class Pedido implements Serializable{

	/**
	 * Atributos da class Pedido
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer quantidade;
	private Double valor;
	@OneToMany
	@JoinColumn(name = "pedido_itens")
	private List<Item> items;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	
	// instancia da lista itens
	public Pedido() {
		this.items = new ArrayList<Item>();
	}
}
