package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public abstract class CustomerCheckManager implements ICustomerCheckService {
	
	
	@Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }

}
