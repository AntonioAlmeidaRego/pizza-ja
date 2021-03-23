package br.com.pizza.service.util;

import java.util.List;
import java.util.Optional;

public interface EntityService<Entity, ID extends Object> {
	public void save(Entity entity);
	public void deleteById(ID id);
	public Optional<Entity> getOne(ID id);
	public List<Entity> findAll();
}
