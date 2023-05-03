package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("tv를 끕니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");
	}
}
