package test;

public class Test {

	public static void main(String[] args) {
		Bird bird = new Bird("앵무새");
		Monkey monkey = new Monkey("개코원숭이");
		Insect insect = new Insect("메뚜기"); 

		Zoo zoo = new Zoo();
		zoo.bird = bird;
		zoo.monkey = monkey;
		zoo.insect = insect;

		System.out.println(zoo.monkey.name);
		System.out.println(monkey.name);

		Zoo z1 = new Zoo(bird, monkey, insect); //이미 만들어진 주소 가져다 사용

		Zoo z2 = new Zoo(new Bird("참새"), new Monkey("몽키"), new Insect("벌레")); //새로 만드는 경우 


	}

}
