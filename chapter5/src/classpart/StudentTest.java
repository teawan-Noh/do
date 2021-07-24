package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		Student lee = new Student(100, "이말숙");
		lee.address = "서울 대동구";
		
		Student kee = new Student();
		kee.studentName = "이숙";
		kee.studentID = 10;
		kee.address = "서울 동구";
		
		lee.studentInfo();
		kee.studentInfo();
		
		System.out.println(lee);
		System.out.println(kee);
	}

}
