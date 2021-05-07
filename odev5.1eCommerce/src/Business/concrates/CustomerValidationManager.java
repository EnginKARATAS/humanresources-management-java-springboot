package Business.concrates;

 
import Business.abstracts.CustomerValidationService;
import Business.abstracts.EmailService;
import core.abstracts.TextCheckService;
import entity.concrates.*;
 
public class CustomerValidationManager implements CustomerValidationService{

	CustomerManager  _customerService;
	TextCheckService _textCheckService ;
	EmailService _emailService;
	
	public CustomerValidationManager(CustomerManager _customerManager, TextCheckService _textCheckService, EmailService _emailService) {
 		this._customerService = _customerManager;//m��terileri y�net
		this._textCheckService = _textCheckService;//regex kontrol� yap
		this._emailService = _emailService;
		
	}

	@Override
	public void register(String name, String surname, String email, String password) {
		// TODO Auto-generated method stub
		if (password.length() > 6 && _textCheckService.checkWithRegex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", email) && _customerService.get(0) != null && name.length()>2 && surname.length()>2 ) {
			_emailService.sendEmail(0, name, surname, "Ba�ar�yla kaydoldunuz");
			_emailService.sendMailWithToken(email, "�##��f4a4�#]23rwei");
			System.out.println(email + "adresine email g�nderildi");
			//kullan�c� objesi olu�tur ve g�nder
			
			Customer customer = new Customer();
			customer.setId(0);
			customer.setFirstName(name);
			customer.setLastName(surname);
			customer.setEmail(email);
			customer.setPassword(password);
			
			_customerService.add(customer);

		}
		else {
			System.out.println("incorrect creditentals");
		}
	}
	

	@Override
	public void login(Customer customer) {
 
 			if (customer.getPassword().length()>6 && _textCheckService.checkWithRegex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", customer.getEmail())) {
 				_customerService.get(customer.getId());
			}
			else {   
				System.out.println("incorrect creditentals");
			}					

	}

 
 


 



 
	
}
