package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("sms Logland� " + message);
		// TODO Auto-generated method stub
		
	}

}
