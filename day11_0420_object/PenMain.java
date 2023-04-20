package day11_0420_object;

public class PenMain {

	public static void main(String[] args) {

		// 펜을 사용사려면 객체로 생성
		Pen redPen = new Pen();
		
		redPen.ink = "빨강색";
		redPen.price = 2000;
		redPen.company = "모나미";
		redPen.write();
		redPen.info();
		System.out.println(" ");
		
		Pen BlackPen = new Pen();
		
		BlackPen.ink = "검정색";
		BlackPen.price = 1000;
		BlackPen.company = "모나미";
		BlackPen.write();
		BlackPen.info();
		System.out.println(" ");
		
		
		
		
		
	}

}
