package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		Student lee = new Student(100, "�̸���");
		lee.address = "���� �뵿��";
		
		Student kee = new Student();
		kee.studentName = "�̼�";
		kee.studentID = 10;
		kee.address = "���� ����";
		
		lee.studentInfo();
		kee.studentInfo();
		
		System.out.println(lee);
		System.out.println(kee);
	}

}
