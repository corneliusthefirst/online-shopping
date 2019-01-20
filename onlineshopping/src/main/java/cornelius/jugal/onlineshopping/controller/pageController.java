package cornelius.jugal.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cornelius.jugal.shoppingbackend.dao.CategoryDAO;
import cornelius.jugal.shoppingbackend.dto.Category;

@Controller
public class pageController {
	
	//here we use spring to autowire our category created
	@Autowired
	private CategoryDAO categoryDAO;
	
     @RequestMapping(value = {"/","/home","/index"})
     public ModelAndView index() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","Home");
    	 
    	 //passing the list of categories
    	 mv.addObject("categories",categoryDAO.list());
    	 mv.addObject("userClickHome",true);
    	 return mv;
     }
     
     @RequestMapping(value = "/about")
     public ModelAndView about() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","About Us");
    	 mv.addObject("userClickAbout",true);
    	 return mv;
     }
     
     @RequestMapping(value = "/contact")
     public ModelAndView contact() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","Contact Us");
    	 mv.addObject("userClickContact",true);
    	 return mv;
     }
     
     //method to load all the products based on category
     
     @RequestMapping(value = "/show/all/products")
     public ModelAndView showAllProducts() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","All Products");
    	  
    	 //passing the list of categories
    	 mv.addObject("categories",categoryDAO.list());
    	 mv.addObject("userClickAllProducts",true);
    	 return mv;
     }
     
     @RequestMapping(value = "/show/category/{id}/products")
     public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
    	 ModelAndView mv = new ModelAndView("page");
    	 
    	 //categoryDAO to fetch a single category
    	 Category category = null;
    	 //create a single category using the get method so we need to go and add that in our categoryDAO
    	 category = categoryDAO.get(id);
    	 //this shall be given as link title
    	 mv.addObject("title",category.getName());
    	 
    	 //passing the list of categories
    	 mv.addObject("categories",categoryDAO.list());
    	 
    	 //passing a single category to front page access(listProducts)
    	 mv.addObject("category",category);
    	 mv.addObject("userClickCategoryProducts",true);
    	 return mv;
     }
     

}
