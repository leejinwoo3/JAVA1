package ch05.sec07;

public class MultidimesionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };

		System.out.println("1차원 배열 길이(반의 갯수):" + scores.length);
		System.out.println("2차원 배열 길이(첫번째 반의 학생수):" + scores[0].length + "명");
		System.out.println("2차원 배열 길이(두번째 반의 학생수):" + scores[1].length + "명");

		// 첫번쨰 반에서 세번째 학생의 점수 읽기
		System.out.println(scores[0][2] + "점");
		// 두번째 반에서 두번째 학생의 점수 읽기
		System.out.println(scores[1][1] + "점");

		// 첫번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println("합계:" + class1Sum);
		System.out.println("평균:" + (double) class1Sum / scores[0].length);
		// 두번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
			System.out.println("합계:" + class2Sum);
			System.out.println("평균:" + (double) class2Sum / scores[1].length);

			// 전체 학생의 평균 점수 구하기
			int totalStudent = 0;
			int totalSum = 0;

			for (int a = 0; i < scores.length; i++) {
				totalStudent += scores[i].length;// 첫번쨰 반의 학생수와 두번째 반의 학생수를 더핸ㄷ;
				for (int k = 0; k < scores[i].length; ++k)
					System.out.println("scores[" + i + "]" + "[" + k + "] :" + scores[i][k]);
				totalSum += scores[i][k];
			}

		}
		System.out.println("전체 학생의 평균 사이즈" + (double) totalSum / totalStuden);
	}

}
