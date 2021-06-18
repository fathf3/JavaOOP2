package Concrete;


import Abstract.CustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {
	
	private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer)  {

        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
       else{
            System.out.println("Not a valid person");
       }

    }
	

}
