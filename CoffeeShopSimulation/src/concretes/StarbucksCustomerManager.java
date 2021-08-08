package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("not a valid person");

		}
	}
}
