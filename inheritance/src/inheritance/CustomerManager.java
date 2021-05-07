package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + "  kaydedildi..");

	}

	public void multiAdd(Customer [] customers) {
		
		for (Customer customer : customers) {
			add(customer);
		}
		
	}
	
	

}
