package googleAuth;

import Business.abstracts.CustomerValidationService;
import entity.concrates.Customer;

public class GoogleAuthManager implements CustomerValidationService{
 
	@Override
	public void register(String name, String surname, String email, String password) {
		// TODO Auto-generated method stub
   	 System.out.println("Google ile kay�t al�nd� :" + email);
		
	}
	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
   	 System.out.println("Google ile giri� yap�ld� : " + customer.getEmail());

	}
}
