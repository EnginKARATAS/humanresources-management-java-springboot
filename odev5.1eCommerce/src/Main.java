import java.util.ArrayList;
import java.util.List;

import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailService;
import Business.concrates.CustomerManager;
import Business.concrates.CustomerValidationManager;
import Business.concrates.SMTPEmailManager;
import Business.concrates.TextCheckManager;
import core.abstracts.CheckService;
import core.abstracts.TextCheckService;
import core.concrate.JavaPatternCheckManager;
import dataAccess.concrates.AbcCustomerDao;
import entity.concrates.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName("Engin");
		customer.setLastName("Karata�");
		customer.setEmail("enginkaratas99@gmail.com");
		customer.setPassword("333333");
		
		Customer customer2 = new Customer();
		customer2.setId(0);
		customer2.setFirstName("Elif");
		customer2.setLastName("Karata�");
		customer2.setEmail("elif@gmail.com");
		customer2.setPassword("sdsdsdsds");
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer2);
	
		CustomerManager customerManager = new CustomerManager(new AbcCustomerDao());
		TextCheckService contextCheckManager = new TextCheckManager(new JavaPatternCheckManager());
		EmailService emailCheckManager = new SMTPEmailManager();
				
		CustomerValidationManager customerValidationManager = new CustomerValidationManager(customerManager, contextCheckManager, emailCheckManager);
			
		System.out.println(customer2.getPassword());
		System.out.println(customer2.getPassword().length());
		customerValidationManager.login(customer2);
 
		
	}

}
