package classesWithAttributesEncapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Hp Laptop");
		product.setPrice(1500);
		product.setStockAmount(3);

		// Constructor ile ekleme
		Product product2 = new Product(2, "Laptop", "Asus Laptop", 2500, 5, "Siyah");

		ProductManager manager = new ProductManager();
		manager.add(product);
		System.out.println("�r�n kodu : " + product.getKod());

	}

}
