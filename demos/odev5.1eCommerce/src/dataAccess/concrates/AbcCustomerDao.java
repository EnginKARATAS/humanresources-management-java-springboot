package dataAccess.concrates;

import dataAccess.abstracts.CustomerDao;
import entity.concrates.Customer;

public class AbcCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� abc dbye eklendi" + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� silindi abc dbden " + customer.getFirstName());

		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� guncellendi abc dbden " + customer.getFirstName());

	}

	@Override
	public Customer get(int id) {
		// TODO Auto-generated method stub
		System.out.println("idsi " + id + "olan user db den getirildi");
	
		return new Customer();
 	}

}
