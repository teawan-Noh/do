package chapter6;

public class Math2 {
	
	
	static void sosu(int num) {
		
		
		for(int i=2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�");
				return;
			}
		}
		
		System.out.println("�Ҽ� �Դϴ�");
		return;
	}
	
	

	public static void main(String[] args) {
		
		Math2 a = new Math2();
		a.sosu(4);
		
		
	}

}
