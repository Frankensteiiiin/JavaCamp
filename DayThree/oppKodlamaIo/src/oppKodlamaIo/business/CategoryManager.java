package oppKodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import oppKodlamaIo.core.loging.Logger;
import oppKodlamaIo.dataAccess.CategoryDao;
import oppKodlamaIo.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = new ArrayList<Category>();
	}

	public void add(Category category) throws Exception {

		for (Category category1 : categories) {
			if (category1.getName().equals(category.getName())) {
				System.out.println(category1.getName());
				throw new Exception("Ayný isimli birden fazla kategori olamaz.");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		

	}

}
