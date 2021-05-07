package Odev2;

public class Product {

	int id;
	int categoryId;
	String productName;
	double unitPrice;
	String detail;

	public Product(int id, int categoryId, String productName, double unitPrice, String detail) {

		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}
}
