package mainTest;

class Seller{
	int income;
	int appleCount;
	int bananaCount;
	
	int sell(int appleCount, int bananaCount) {
		this.appleCount -= appleCount;
		this.bananaCount -= bananaCount;
		
		int total = (appleCount * new Apple().price) + (bananaCount * new Banana().price);
		
		return total;
	}
	
	void takeMoney(int total){
		this.income += total;
	}
}

class Buyer{
	int money;
	
	void order(Seller seller, int appleCount, int bananaCount) {
		//seller.sell(appleCount, bananaCount);
		int total = seller.sell(appleCount, bananaCount);
		giveMoney(seller, total);
	}
	
	void giveMoney(Seller seller, int total) {
		this.money -= total;
		seller.takeMoney(total);
	}
}


public class Main {

	public static void main(String[] args) {
		Seller s1 = new Seller();
		s1.appleCount = 500;
		s1.bananaCount = 500;
		
		Seller s2 = new Seller();
		s2.appleCount = 1000;
		s2.bananaCount = 1000;
		
		Buyer b1 = new Buyer();
		b1.money = 100000;
		
		Buyer b2 = new Buyer();
		b2.money = 200000;
		
		b1.order(s1, 50, 50);
		//b2.order(s2, 100, 100);

		System.out.println(s1.appleCount);
		System.out.println(s1.bananaCount);
		System.out.println(s1.income);
		System.out.println(b1.money);
	}

}
