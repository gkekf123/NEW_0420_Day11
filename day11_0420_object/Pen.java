package day11_0420_object;

// 설계도로 사용 할 클래스를 메인이 없습니다.
public class Pen {

	// 클래스 속성(값 저장)을 나타낼때 멤버변수(field)
		int price;
		String ink;
		String company;
	
	// 클래스 안에 기능을 나타낼 때, 메서드라고 부른다.
		void write() {
			System.out.println(ink + " 색상 글씨를 씁니다.");
		}
		void info() {
			System.out.println("========== 팬의 정보 ==========");
			System.out.println("가격 : " + price);
			System.out.println("색상 : " + ink);
			System.out.println("제조사 : " + company);
		}
}
