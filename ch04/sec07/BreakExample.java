package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) { 
			
			
			//1부터 6개의 숫자
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
			System.out.println("반복");
		}
	}

}
