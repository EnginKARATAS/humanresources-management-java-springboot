package inheritance2;

public class CustomerManager {
	//parametresiz versyonuda yap�labilir
	public void add(Logger logger) {
		System.out.println("customer eklendi");
		logger.log();
	}
}
