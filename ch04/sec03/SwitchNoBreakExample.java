package ch04.sec03;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8부터 4개의 숫자 구하기 = > 8~11사이의 정수
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재 시간:" + time + "시");
		
		//컨트롤 + 스페이스 => 자동완성 단축키
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의합니다.");
			break;
		case 10:
				System.out.println("업무를봅니다.");
				break;
	
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	}

}
