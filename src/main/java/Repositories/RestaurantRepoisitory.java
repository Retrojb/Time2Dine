package Repositories;

import org.springframework.data.repository.CrudRepository;

import Pojo.Restaurant;

public interface RestaurantRepoisitory extends CrudRepository<Restaurant, Long> {

}
