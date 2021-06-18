package Abstract;

import Entities.Customer;

public abstract class CustomerManager  implements ICustomerService {
	
	@Override
    public void Save(Customer customer) {
        System.out.println("Save to Db : "+ customer.getFirstName());

    }

}
