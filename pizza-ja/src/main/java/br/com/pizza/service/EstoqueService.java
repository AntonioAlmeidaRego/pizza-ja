package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Estoque;
import br.com.pizza.repository.EstoqueRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class EstoqueService extends EntityServiceAbstract<Estoque, Long>{
	@Autowired
	private EstoqueRepository repository; 
}
