package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
 

public class EdevletServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return customer.getId().length()==11;

	}

}
