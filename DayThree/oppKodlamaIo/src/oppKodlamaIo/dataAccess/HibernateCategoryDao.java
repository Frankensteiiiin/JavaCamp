package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanýna kategori eklendi :" + category.getName());
	}

}
