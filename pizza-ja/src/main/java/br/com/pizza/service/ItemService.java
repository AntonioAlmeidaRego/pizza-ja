package br.com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pizza.model.Item;
import br.com.pizza.repository.ItemRepository;
import br.com.pizza.service.util.EntityServiceAbstract;

@Service
public class ItemService extends EntityServiceAbstract<Item, Long>{
	@Autowired
	private ItemRepository repository; 
}
