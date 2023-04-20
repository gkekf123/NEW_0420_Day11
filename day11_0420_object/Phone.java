package day11_0420_object;

public class Phone {

	String model;
	String color;
	int price;
	
	// 생성자는 맴버변수 아래에 만듦
	// 반환유형이 없다.
	// 멤버변수를 초기화 하는 용도로 사용 초기값을 줄 수 있다
	// 기본 생성자 많이 사용
	// 생성자를 직접 생성하게 되면, JVM이 생성자를 자동생성 하지 않는다.
	Phone() {	
		System.out.println("생성자 호출");
		model = "갤럭시";
		color = "검정색";
		price = 100000;
	}
	
	// 생성자는 여러 개 선언 가능
	// 단. 매개변수의 종류 or 갯수가 달라야 함
	Phone(String a){
		model = a;
		color = "핑크";
		price = 200000;
	}
	
	Phone(String a, String b){
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int c) {
		model = a;
		color = "그린";
		price = c;
	}
	
	Phone(String a,String b, int c){	//맴버 변수 생성자 사용
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("========== 폰의 정보 ==========");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
	}
	
}
