package inheritance;

public class GoldCustomer extends Customer {

	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	// 애니테이션 : 컴파일러에서 어떤 역할을 하는지 알려줌, 여기에선 overriding 된 함수라고 알려주는 
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}
	
}
