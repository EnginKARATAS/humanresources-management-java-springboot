package odev3;

public class UserManager {

	public void login(User user) {
		System.out.println(user.getName()+" "+user.getSurname() + " " + "sisteme giri� yapt�");
	}
	
	public void logout(User user) {
		System.out.println(user.getName()+" "+user.getSurname() + " " + "sistemden ��k�� yapt�");
	}
	

	public void commitRoll(User user) {
		System.out.println("base classtan " +user.getName()+ " commitledi");
	}
	
	
}
