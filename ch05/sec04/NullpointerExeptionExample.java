package ch05.sec04;

public class NullpointerExeptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] intArray =null;
		intArray[0]= 10;
		
		String str =null;
		System.out.println(str.length());
	}

}
