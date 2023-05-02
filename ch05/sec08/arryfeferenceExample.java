package ch05.sec08;

public class arryfeferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray =new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] =new String("java");
		
		System.out.println(strArray[0] == strArray[1]); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
