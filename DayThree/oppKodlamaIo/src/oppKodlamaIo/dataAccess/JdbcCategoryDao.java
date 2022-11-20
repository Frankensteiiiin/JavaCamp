package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao  {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanýna kategori eklendi : "+ category.getName());
		
	}

}
