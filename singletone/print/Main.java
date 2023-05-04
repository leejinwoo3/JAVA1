package singletone.print;

public class Main {

	private static final int USER_NUM = 10;

	public static void main(String[] args) {

		User[] user = new User[USER_NUM];
		for (int i = 0; i < USER_NUM; i++) {
			user[i] = new User(i + "번 직원");
			user[i].print();
		}
	}

}
