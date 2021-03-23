package br.com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pizza.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
