
public class Seller {
	private int bananaPrice = 1500;
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
	public int sell( int money ) { 
		
		//1. 구매자 낸 금액을 금고에 넣는다
//		this.money = this.money + money;
		this.money += money;
		
		//2. 구매자가 낸 금액에 맞게 바나나를 준다.
		int bananaCount = money / bananaPrice;
		this.banana -= bananaCount;
		
		//3. 거스름돈이 있으면 거스름돈을 건네어준다.
		int remainMoney = money - (bananaCount * bananaPrice);
		this.money -=remainMoney;
		
		return bananaCount;
		
	}
	public String toString() {
		System.out.println("판매자의 바나나는 " + banana + "개 입니다.");
		System.out.println("판매자가 가진 돈은" + money + "원 입니다.");
		
		return"";
	
	}
}

