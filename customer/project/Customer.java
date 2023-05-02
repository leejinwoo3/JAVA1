package customer.project;

//silver등급  고객에 대한 class이면서 기본적인 고객

public class Customer {
	// 필드
	protected int customerID;// 고객 아이디
	protected String customerName;// 고객 이름
	protected String customerGrade;// 고객 등급
	int bounsPoint;// 보너스 점수
	double bonusRatio;// 보너스 비율

	// 생성자
	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// 메소드
	// 고객 등급 초기화
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;

	}

	// 보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) {
		// 1.보너스 포인트 쌓인다.
		bounsPoint += (price * bonusRatio);
		// 2.사용자가 지불할 가격을 리턴.
		return price;// 일반(실버) 고객은 할인이 없으므로 지불한 값을 리턴해준다.
	}

	// 고객정보 출력 메소드
	public String showCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bounsPoint + "점";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
