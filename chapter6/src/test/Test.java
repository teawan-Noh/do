package test;

public class Test {

	public static void main(String[] args) {
		Bird bird = new Bird("�޹���");
		Monkey monkey = new Monkey("���ڿ�����");
		Insect insect = new Insect("�޶ѱ�"); 

		Zoo zoo = new Zoo();
		zoo.bird = bird;
		zoo.monkey = monkey;
		zoo.insect = insect;

		System.out.println(zoo.monkey.name);
		System.out.println(monkey.name);

		Zoo z1 = new Zoo(bird, monkey, insect); //�̹� ������� �ּ� ������ ���

		Zoo z2 = new Zoo(new Bird("����"), new Monkey("��Ű"), new Insect("����")); //���� ����� ��� 


	}

}
