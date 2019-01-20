package cornelius.jugal.shoppingbackend.dao;

import java.util.List;

import cornelius.jugal.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
    Category get(int id);
}
