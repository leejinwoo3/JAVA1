package question;

public class q4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
				if (x == y) {
					System.out.println();
				}
			}
		}
	}
}
