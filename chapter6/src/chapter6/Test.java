package chapter6;

public class Test {
	
	int baseScore = 70;
	
	Test(){};
	
	String isPass(int myScore) {
		String result = "";
		if(baseScore > myScore) {
			result = "�� �����ϼ���";
		}else if(baseScore < myScore ) {
			result = "���� ������ ���";
		}else {}
		return result;
	}
	
	

	public static void main(String[] args) {
			Test p1 = new Test();
		//	p1.isPass(80);
			System.out.println(p1.isPass(80));
	}

}
