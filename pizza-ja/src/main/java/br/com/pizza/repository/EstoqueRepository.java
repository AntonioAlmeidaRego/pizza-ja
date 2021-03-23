package br.com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pizza.model.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
