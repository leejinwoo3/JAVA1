package ch04.sec02;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		if(score >= 90) {//90점 이상
			System.out.println("학점 A 입니다.");
		}else if(score >=80) {//80~89
			System.out.println("학점 B 입니다.");
		}else if(score >=70) {//70 ~79
			System.out.println("학점 c 입니다.");
		}else{//60이하
			System.out.println("학점 D 입니다.");
		}
		
	}

}
