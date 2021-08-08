package homeWork;

import java.util.GregorianCalendar;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager neroCustomerManager= new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer= new Customer();
		customer.setId(1);
		customer.setFirstName("bayram");
		customer.setLastName("Kayış");
		customer.setNationalityId("12871950222070");
		customer.setDataOfBirth(new GregorianCalendar(1992, 07, 01).getTime());
		
		Customer customer2= new Customer(2, "Ramazan","Kayış",new GregorianCalendar(1992, 07, 01).getTime(), "12871950070");
		
		neroCustomerManager.Save(customer);
		neroCustomerManager.Save(customer2);
		starbucksCustomerManager.Save(customer);
		starbucksCustomerManager.Save(customer2);
	}
	

}
