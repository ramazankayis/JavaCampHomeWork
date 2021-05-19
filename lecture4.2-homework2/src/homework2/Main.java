package homework2;

import java.util.GregorianCalendar;

import homework2.adapters.MernisServiceAdapter;
import homework2.entities.Customer;
import homework2.interfaces.CustomerCheckService;
import homework2.interfaces.CustomerService;
import homework2.services.StarbucksCustomerCheckManager;
import homework2.services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setIdentityNumber("12871950070");
		enginCustomer.setFirstName("Ramazan");
		enginCustomer.setLastName("Kayış");
		enginCustomer.setBirthDate(new GregorianCalendar(1992, 07, 01).getTime());

		CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());

		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.add(enginCustomer);

	}

}
