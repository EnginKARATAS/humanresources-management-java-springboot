package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	public Product(int id ,String name, String detail,  double unitPrice) {
		System.out.println("�ok parametreli constuctor");
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
	}
	
	int id; 
	String name;
	double unitPrice;
	String detail;
	
}
