package question;

public class q5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int x=0; x <array.length; x++) {
			for(int y=0; y< array[x].length;y++) {
				sum += array[x][y];
				count ++;
			}
		}
		avg=(double) sum/count;
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
