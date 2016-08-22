
public class Market {

	public static void main(String[] args) {
		
		Seller bananaSeller = new Seller();
		bananaSeller.setBanana(50);
		bananaSeller.setMoney(1000);
		
		Buyer bananaBuyer = new Buyer();
		bananaBuyer.setBanana(0);
		bananaBuyer.setMoney(100000);
		
		System.out.println(bananaSeller);
		System.out.println(bananaBuyer);
		
		bananaBuyer.buy(bananaSeller, 3000);
		
		System.out.println(bananaSeller);
		System.out.println(bananaBuyer);
		
	}
}
