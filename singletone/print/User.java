package singletone.print;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getPrinter();

		// printer.toString() : 객체의 주소를 찍는다.
		printer.print(this.name + "프린트 사용중" + printer.toString() + ".");
	}
}
