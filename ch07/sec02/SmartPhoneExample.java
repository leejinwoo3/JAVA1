package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("갤럭시","검정");

		myPhone.setwifi(true);
		System.out.println("와이파이 상태 : " + myPhone.wifi);

		
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiVoice("안녕하세요 ! 저는 이진우입니다.");
		myPhone.hangup();
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}

}
