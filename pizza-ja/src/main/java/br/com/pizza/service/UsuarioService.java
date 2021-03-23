package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Usuario;
import br.com.pizza.repository.UsuarioRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class UsuarioService extends EntityServiceAbstract<Usuario, Long> {

	@Autowired
	private UsuarioRepository repository; 

}
