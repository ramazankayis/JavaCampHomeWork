package inheritance;

public class Main {

	public static void main(String[] args) {
		 
	 
		IndividualCustomer ramazan = new IndividualCustomer();
		
		ramazan.customerNumber="132123";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		
		hepsiBurada.customerNumber="987654";
		
		CustomerManager customerManager= new CustomerManager();
		 Customer [] customers = {ramazan,hepsiBurada};
		 customerManager.multiAdd(customers);
	}

}
