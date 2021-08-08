package chapter6;

public class Test {
	
	int baseScore = 70;
	
	Test(){};
	
	String isPass(int myScore) {
		String result = "";
		if(baseScore > myScore) {
			result = "더 공부하세여";
		}else if(baseScore < myScore ) {
			result = "이젠 나가서 놀아";
		}else {}
		return result;
	}
	
	

	public static void main(String[] args) {
			Test p1 = new Test();
		//	p1.isPass(80);
			System.out.println(p1.isPass(80));
	}

}
