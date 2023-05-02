package ch05.sec06;

public class ArrayCreateByeNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열타입, 크기만
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[1]);
		}
		System.out.println("==================");

		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
