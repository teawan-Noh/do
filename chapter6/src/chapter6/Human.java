package chapter6;

class Human{
	//공통으로 가진 dna = s1000
		//각자 가진 나이 키 몸무게 
		//(키 - 100) *0.9가 몸무게보다 -10이하 경우 저체중
		                         //10이상일때 비만
								//그외 정상 
	static String DNA = "S1000";
	int age;
	int height;
	int weight;

	Human(int height, int weight){
			this.height = height;
			this.weight = weight;
	}

	String obesity(int height, int weight){
		String amIPig = "";
		double calcObesity = (height - 100) * 0.9;

		if(calcObesity - weight > 10){
			return amIPig = "돼지세끼 입니다 뒤지기 싫으면 그만 처먹으세요";
		} else if (calcObesity - weight < -10){
			return amIPig = "젓가락이세요?";
		} else {
			return amIPig = "정상 입니다";
		}
		
		
		
	}	
}

