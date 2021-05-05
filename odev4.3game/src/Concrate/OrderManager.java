package Concrate;

import Abstract.OrderService;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class OrderManager implements OrderService{

	@Override
	public void add(Customer customer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " oyununu " + campaign.getAmount() + " indirim ile sat�n ald�n�z sn. " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(int campaignId) {
		// TODO Auto-generated method stub
		System.out.println(campaignId + " nolu sipari�inizi sildiniz");
		
	}

	@Override
	public void update(int campaignId, Customer customer, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaignId + " numaral�" + campaign.getAmount() +" indirimli oyununuzun bilgileri g�ncellenmi�tir sn." + customer.getFirstName() + " " + customer.getLastName());
	} 

}
