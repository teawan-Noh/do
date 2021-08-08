package chapter6;

public class Math2 {
	
	
	static void sosu(int num) {
		
		
		for(int i=2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("소수가 아닙니다");
				return;
			}
		}
		
		System.out.println("소수 입니다");
		return;
	}
	
	

	public static void main(String[] args) {
		
		Math2 a = new Math2();
		a.sosu(4);
		
		
	}

}
