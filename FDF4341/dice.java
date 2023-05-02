package FDF4341;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1 ; x<=6 ; x++) {
			for(int y=1 ; y<=6 ; y++) {
				if(x+y==6){
					System.out.println(x+ ","+y);
				}
			}
		}
	}

}
