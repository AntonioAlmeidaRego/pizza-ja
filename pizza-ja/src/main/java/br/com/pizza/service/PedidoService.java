package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Pedido;
import br.com.pizza.repository.PedidoRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class PedidoService extends EntityServiceAbstract<Pedido, Long>{
	@Autowired
	private PedidoRepository repository;
 
}
