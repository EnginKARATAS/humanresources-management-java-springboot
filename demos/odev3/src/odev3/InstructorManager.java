package odev3;

public class InstructorManager extends UserManager{            
	
	public void openRoll() {
	//close after 3 hour	
	}
	
	@Override
	public void commitRoll(User user) {
		System.out.println("��retmen class�ndan ��retmen " + user.getName() +" "+user.getSurname()+" yoklamay� commitledi");

	}
	
	public void addHomeWork() {
		
	}
	
	public void addNewActivity() {
		
	}
	
	public void addNewCourse() {
		
	}
	
	
	

}
