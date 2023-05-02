package customer.project;

public class VIPCustomer extends Customer {
	double saleRatio;// 할인률
	private int agentID;// 상담원 ID

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		// 1.보너스 포인트가 쌓인다.
		bounsPoint += (price * bonusRatio);
		// 2. 사용자가 지불할 가격을 리턴(할인이 된다.)
		return price - (int) (price * saleRatio);
	}

//담당 상담원의 정보 출력
	@Override
	public String showCustomerInfo() {
		// 고객이름, 등급, 현재보너스 포인트,상담원ID 출력
		return super.showCustomerInfo() + ", 담당 상담원 번호 : " + agentID;
	}

}
