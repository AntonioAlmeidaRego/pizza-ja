package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Endereco;
import br.com.pizza.repository.EnderecoRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class EnderecoService extends EntityServiceAbstract<Endereco, Long>{
	@Autowired
	private EnderecoRepository repository; 
}
