package br.com.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pizza.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
