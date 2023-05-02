package question;

public class q5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		int min = 1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) 
				max=array[i];
			
			}
		for(int y=1; y<array.length;y++) {
			if(array[y]<min)
				min=array[y];
		}
			
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
