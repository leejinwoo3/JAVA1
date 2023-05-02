package FDF4341;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random() * 100);
		int input = 0;
		int count = 0;

		java.util.Scanner s = new java.util.Scanner(System.in);

		do {

			count++;

			System.out.print("1과 100사이의 값을 입력하시오 : ");

			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.

			System.out.println();

			if (answer > input) {

				System.out.println("더 큰 수를 입력하시오.");

			} else if (answer < input) {

				System.out.println("더 작은 수를 입력하시오.");

			} else {

				System.out.print("맞췄습니다.");

				System.out.print("시도횟수는 " + count + "번입니다.");

				break;

			}

		} while (true);

	}

}
