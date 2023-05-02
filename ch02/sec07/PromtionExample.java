package ch02.sec07;

public class PromtionExample {

	public static void main(String[] args) {
		byte byteValue = 10;// 00001010
		int intValue = byteValue;// 0000000 00000000 00000000 00001010
		System.out.println(intValue);
		
		char charValue = 'A'; //65
		intValue =charValue;
		System.out.println(intValue);
		
		 byteValue = 65;
		 charValue = (char) byteValue ;
		 

		// 00000000 00000000 00000000 00110010
		intValue = 50;

		// 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00110010
		long longValue = 50;
		System.out.println(longValue);
		
		
		longValue = 100 ;
		float floatValue = longValue ;
		System.out.println(floatValue);
		// 알트 + 방향키 : 행 위치 이동
		
		floatValue = 100.5F;
		double doubleValue = floatValue ;
		System.out.println(doubleValue);
	}

}
