
package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	
	public static void main(String[] args) {
		String a = "10";
		int value1 = Integer.parseInt(a);//string => int
		double value2 = Double.parseDouble(a);
		boolean value3 = Boolean.parseBoolean("true");
		
		
		
		System.out.println("value1:" + value1);
		System.out.println("value1:" + value2);
		System.out.println("value1:" + value3);
		
		
		
		
		//숫자 타입 = > 문자열
		String str1 = String.valueOf(10); //int =>String
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
	
}