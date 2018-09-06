package Repositories;

import org.springframework.data.repository.CrudRepository;

import Pojo.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
