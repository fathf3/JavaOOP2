import Abstract.CustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		  CustomerManager customerManager = new NeroCustomerManager();
	      customerManager.Save(new Customer(1, "Fatih", "Mutlu", 1995, 11111));
	      
	      
		

	}

}
