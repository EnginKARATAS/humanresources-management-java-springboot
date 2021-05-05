package Concrate;

import Abstract.CheckService;
import Abstract.CustomerService;
import Entity.Customer;

public class CustomerManager implements CustomerService {

	CheckService _checkService;
	
	
	public CustomerManager(CheckService _checkService) {
 		this._checkService = _checkService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (_checkService.isUserExists(customer)) {
			System.out.println(customer.getFirstName() + " adl� kullan�c� sisteme eklendi");
		}
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getId() + "id li kullan�c� silindi");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName() +" isimli kullan�c� g�ncellendi");
		
	}

}
