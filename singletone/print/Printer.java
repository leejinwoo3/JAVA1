package singletone.print;

public class Printer {
	// 필드
	private static Printer printer = null;

	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();// printer 인스턴스 생성
		}
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}
