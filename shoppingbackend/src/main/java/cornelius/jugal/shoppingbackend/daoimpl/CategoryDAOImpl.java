package cornelius.jugal.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cornelius.jugal.shoppingbackend.dao.CategoryDAO;
import cornelius.jugal.shoppingbackend.dto.Category;

//me use the repository annotation so that it can be accessed at the front end
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
    private static List<Category> categories = new ArrayList<>();
	
    static {
    	Category category = new Category();
    	//adding first category
    	category.setId(1);
    	category.setName("Television");
    	category.setDescription("This is the description of the television");
    	category.setImageUrl("CAT_1.png");
    	
    	categories.add(category);
    	
    	//second category
    	category = new Category();
    	//adding first category
    	category.setId(2);
    	category.setName("Mobile");
    	category.setDescription("This is the description of the television");
    	category.setImageUrl("CAT_2.png");
    	
    	categories.add(category);
    	
    	//third category
    	category = new Category();
    	//adding first category
    	category.setId(3);
    	category.setName("Laptop");
    	category.setDescription("This is the description for Laptop");
    	category.setImageUrl("CAT_3.png");
    	
    	categories.add(category);
    	
    }
    
    
  
    
     
    @Override
	public List<Category> list() {
		
		return categories;
	}



	@Override
	public Category get(int id) {
	   
		//enhance for loop
		for(Category category : categories) {
			if(category.getId() == id){return category;}
		}
		return null;
		
	}

}
