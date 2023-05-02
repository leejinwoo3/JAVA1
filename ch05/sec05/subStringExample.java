package ch05.sec05;

public class subStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		
		//substring(시작 인덱스. 끝 인덱스)
		String firstnum = ssn.substring(0,6);
		System.out.println(firstnum);
		
		//substring(시작인덱스)=> 시작인덱스부터 문자열 까지
		String secondtnum = ssn.substring(7);
		System.out.println(secondtnum);
	}

}
