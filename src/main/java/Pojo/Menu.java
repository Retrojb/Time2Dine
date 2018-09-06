package Pojo;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Menu {

		@Id
		@GeneratedValue
		
		private Long menuId;
		private String menuName;
		
		@OneToMany(mappedBy="menu")
		private Collection<Item> item;
		
		@ManyToOne
		private Restaurant restaurant;
		
		public Menu () {}

		public String getMenuName() {
			return menuName;
		}

		public void setMenuName(String menuName) {
			this.menuName = menuName;
		}

		public Collection<Item> getItem() {
			return item;
		}


		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}

		public Menu(String menuName, Restaurant restaurant, Item... item) {
			this.menuName = menuName;
			this.restaurant = restaurant;
			this.item = Arrays.asList(item);
		}
		
		
}
