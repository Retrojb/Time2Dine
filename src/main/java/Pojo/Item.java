package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long itemId;
	private String itemName;
	private String itemIngredients;
	
	@ManyToOne
	private Menu menu;
	
	public Item() {}

	public Long getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemIngredients() {
		return itemIngredients;
	}

	public Menu getMenu() {
		return menu;
	}

	public Item(String itemName, String itemIngredients, Menu menu) {
		this.itemName = itemName;
		this.itemIngredients = itemIngredients;
		this.menu = menu;
	}
	
	
}
