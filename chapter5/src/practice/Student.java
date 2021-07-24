package practice;

public class Student {

	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		
		korea = new Subject("����");
		math = new Subject("����");
	}
	public Student(int id, String name) {
		
		studentName = name;
		studentID = id;
		
		korea = new Subject("����");
		math = new Subject("����");
	}

	public void setKorea(int score) {
		korea.score = score;
	}
	public void setMath(int score) {
		math.score = score;
	}
	
	public void showStudentInfo() {
			int total = korea.getScore() +math.getScore(); 
			System.out.println(studentName + "�л��� ������" + total + "�Դϴ�");
	}
	
	
	
}
