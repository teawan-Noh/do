package chapter6;

class Human{
	//�������� ���� dna = s1000
		//���� ���� ���� Ű ������ 
		//(Ű - 100) *0.9�� �����Ժ��� -10���� ��� ��ü��
		                         //10�̻��϶� ��
								//�׿� ���� 
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
			return amIPig = "�������� �Դϴ� ������ ������ �׸� ó��������";
		} else if (calcObesity - weight < -10){
			return amIPig = "�������̼���?";
		} else {
			return amIPig = "���� �Դϴ�";
		}
		
		
		
	}	
}

