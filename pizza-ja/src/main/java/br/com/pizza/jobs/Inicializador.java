package br.com.pizza.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Usuario;
import br.com.pizza.service.UsuarioService;

@Service
public class Inicializador implements ApplicationListener<ContextRefreshedEvent>{
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Usuario usuario = new Usuario();
		usuario.setNome("Antonio Almeida");
		usuario.setEmail("antonio.alm_pdf@hotmail.com");
		//usuarioService.save(usuario);
	}
	
}
