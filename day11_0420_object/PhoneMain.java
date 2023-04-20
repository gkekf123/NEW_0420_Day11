package day11_0420_object;

public class PhoneMain {

	public static void main(String[] args) {

		// 객새생성 방법1
		Phone black = new Phone();
		black.info();
		
		// 객체생성 방법2
		Phone pink = new Phone("아이폰");
		pink.info();
	
		// 객체생성 방법3
		Phone red = new Phone("TTL", "빨강");
		red.info();
		
		Phone green = new Phone("블랙베리", 400000);
		green.info();
		
		//model, color, price를 매개변수로 받아서 초기화하는 생성자
		Phone white = new Phone("모토로라", "하얀색", 500000);
		white.info();
	}

}
