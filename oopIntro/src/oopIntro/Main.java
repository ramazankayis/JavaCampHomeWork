package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product =new Product();
		
		product.name="ramazan";
		product.id=1;
		product.detail="16 GB Ram";
		Product[] products= {product};
		
		Product product1= new Product(1, "lenovo", 1, "v15", 10, 15);
		
		System.out.println(product.name);
		System.out.println(products.length);

		Product product2 =new Product();
		product2.setId(2);
		product2.setName("Lenovo 15");
		product2.setDetail("16 Gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category= new Category();
		category.setId(1);
		category.setName("içecek");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		System.out.println(category.getName());
		System.out.println(category2.getName());
	}

}
