package Abstract;
 import Entities.Customer;
public abstract class BaseCustomerService implements CustomerService{
	
 	public void save(Customer customer) throws Exception {
 		System.out.println(customer.getFirstName() + " veritaban�na kaydedildi.");
	}
}
