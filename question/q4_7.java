package question;

public class q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;//첫번째 값
		int num2 = 1;//두번째 값
		int num3 = 0;//세번째 값
		System.out.print(num1+","+num2);
		//8번 덧셈
		for (int i=0; i<20; i++) {
			num3= num1+num2;
			System.out.print(","+num3);
			num1=num2;//두번째 수열을 첫번째 값으로 한다.
			num2=num3;//세번째 수열을 두번째 값으로 한다.
			
		}
		
	}

}
