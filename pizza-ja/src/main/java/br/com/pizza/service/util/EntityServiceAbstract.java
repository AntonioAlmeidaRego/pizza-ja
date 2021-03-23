package br.com.pizza.service.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
 
@Service
public abstract class EntityServiceAbstract<Entity, ID> 
	implements EntityService<Entity, ID> {
	@Autowired
	private JpaRepository<Entity, ID> repository;  
	
	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);
	}
	
	@Override
	public void save(Entity entity) { 
		repository.saveAndFlush(entity);
	}
	
	@Override
	public List<Entity> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Entity> getOne(ID id) {
		return repository.findById(id);
	}
	
}
