package ch04.sec04;

public class MultiplactionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 1; m <= 12; m++) {
			System.out.println("***" + m + "단***" + "");
			for (int n = 1; n < 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}

	}

}
