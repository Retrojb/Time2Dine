package Pojo;

import java.awt.Menu;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue
	private Long restaurantId;
	private String restaurantName;
	
	@OneToMany(mappedBy="restaurant")
	private Collection <Menu> menu;
	
	Restaurant(){}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public Collection<Menu> getMenu() {
		return menu;
	}

	public Restaurant(String restaurantName, Menu... menu) {
		this.restaurantName = restaurantName;
		this.menu = Arrays.asList(menu);
	}
	
	
	
}
