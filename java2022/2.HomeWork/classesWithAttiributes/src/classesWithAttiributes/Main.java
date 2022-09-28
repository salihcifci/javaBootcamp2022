package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setId(2);
//		product.setRenk("pembe");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		
		
		// yanlis kullanım
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		productManager.Add2(2, "null", "null", 5, 222);
		
	}

}
