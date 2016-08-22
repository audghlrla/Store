
public class Buyer {

	private int banana;
	private int money;
	public int getBanana() {
		return banana;
	}
	public void setBanana(int banana) {
		this.banana = banana;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void buy( Seller seller, int money) {
		//1. 구매자가 구매한 만큼의 돈을 뺀다
		this.money -= money;
		
		//2,판매자로부터 바나나를 산다.
		
		int bananaCount = seller.sell(money);
		
		//3. 바나나를 더한다.
		this.banana += bananaCount;
		
	}
	
	public String toString() {
		System.out.println("구매자의 바나나는 " + banana + "개 입니다.");
		System.out.println("구매자가 가진 돈은" + money + "원 입니다.");
		
		return"";
		
	}
}
