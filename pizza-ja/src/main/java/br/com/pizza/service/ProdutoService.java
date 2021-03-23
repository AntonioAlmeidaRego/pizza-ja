package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Produto;
import br.com.pizza.repository.ProdutoRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class ProdutoService extends EntityServiceAbstract<Produto, Long>{
	@Autowired
	private ProdutoRepository repository; 
}
