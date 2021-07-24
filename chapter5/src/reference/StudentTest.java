package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student james = new Student(100, "james");
		james.setKorea(100);
		james.setMath(100);
		
		Student tomas = new Student(101, "tomas");
		tomas.setKorea(90); 
		tomas.setKorea(90); 
		
		
		james.showStudentInfo();
		tomas.showStudentInfo();
	}

}
