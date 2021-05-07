package Odev2;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, 1, "ayran", 1, "sütaş ayran");
		Product product2 = new Product(2, 1, "cola", 1, "coco cola");

		Product[] products = { product1, product2 };

		for (Product product : products) {

			System.out.println("ürün adı: " + product.productName);

		}
		System.out.println("**123***3123****************12321312*********3123213");

		Category category1 = new Category(1, "içeçekler");
		Category category2 = new Category(2, "süt ürünleri");

		Category[] categories = { category1, category2 };
		for (Category category : categories) {
			System.out.println("ürün kategori ismi : " + category.categoryName);
		}

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category2);

		ProductManager productManager = new ProductManager();
		productManager.SelectProduct(product1);

	}

}
