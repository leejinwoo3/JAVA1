package question;

public class q4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;// 1부터 6까지
			int num2 = (int) (Math.random() * 6) + 1;// 1부터 6까지
			System.out.println("(" + num1 + "," + num2 + ")");
			if ((num1 + num2) == 5) {
				break;
			}
		}
	}
}
