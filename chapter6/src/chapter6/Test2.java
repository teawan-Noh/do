package chapter6;

import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		//45���� ���� �� �ִ� �迭�� booleanŸ������ �����, ���������� ���� �̾��� �� �ش� ���� �迭���� True�� ����ȴ�. 
		//�� 6���� �迭�� True���� ������ ��, �迭�� �ε����� ���� ����ϰ� ����ȴ�.
		
		boolean[] arr = new boolean[45];
		
		int count = 0;
		while(count < 6) {
			int x = (int)(Math.random()*45);
			if(!arr[x]) {
				arr[x] = true;
				
				count += 1;
				
				System.out.print(x + " ");
			}
		}
	}

}
