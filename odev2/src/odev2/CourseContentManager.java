package odev2;

public class CourseContentManager {
	
	//buras�n� okuma
	//
	//ICourseManager courseManager;
	//constructor parametresine ICourseManager i ver
	//Depenndency Inversion budur
	
	public CourseContentManager() {
		
	}
	
	public void Delete(String title) {
		System.out.println("verdii�in titleye g�re course contentinin ba�l���n� bulup sildim " + title);
	}
	
	public void Add(Course content) {
		System.out.println("verilen content, base class�n titlesine g�re eklendi");
		System.out.println(content);
		System.out.println(content);
	}
}
