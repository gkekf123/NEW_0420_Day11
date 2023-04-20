package day11_0420_object;

public class Variable {

	//int a;	// 멤버변수 - 선언만 할 수 있따.
	int a = 1;	// 선언과 동시에 초기화는 가능
	//a = 10;	// 메서드 안에서 사용 할 수 있다
	
	//int b; //초기값이 없지만 사용 가능 - 기본
	String b;
	
	
	void printNum(int d) {
		int c = 1;	// 지역변수 \\ int b - 매개변수도 지역변수에 속한다
		System.out.println("멤버변수 : " + a);	// 외부에서 변경 가능
		System.out.println("멤버변수 : " + b);
		System.out.println("지역변수 : " + c);	// 외부에서 변경 불가능
		System.out.println("지역변수(매개변수) : " + d);	// 매개변수는 전달을 하게 되니까 초기화없이 사용 할 수 없다
		
	}
}
