package chapter6;

import java.util.Scanner;

public class Test2 {

	
	public static void main(String[] args) {
		//45까지 담을 수 있는 배열을 boolean타입으로 만들고, 랜덤값으로 값을 뽑았을 때 해당 값의 배열값이 True로 변경된다. 
		//총 6개의 배열이 True값을 가졌을 때, 배열의 인덱스를 각각 출력하고 종료된다.
		
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
