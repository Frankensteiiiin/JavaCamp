package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.name="Laptop";
		product.id=1;
		product.description="Hp Laptop";
		product.price=1500;
		product.stockAmount=3;
		
		
		ProductManager manager = new ProductManager();
		manager.add(product);
		
	}

}
