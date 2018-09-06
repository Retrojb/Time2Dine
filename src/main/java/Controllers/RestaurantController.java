package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Repositories.ItemRepository;
import Repositories.MenuRepoistory;
import Repositories.RestaurantRepoisitory;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantRepoisitory restaurantRepo;
	
	@Autowired
	MenuRepoistory menuRepo;
	
	@Autowired
	ItemRepository itemRepo;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		return "home";
	}
}
