package day11_0420_object;

public class VariableaMain {

	public static void main(String[] args) {
		
		Variable var = new Variable();	// 생성자 -> Variable()
		
		// 멤버변수는 외부에서 변경 가능
		var.a = 100;
		var.b = "바꿈";
		
		// 지역변수는 외부에서 변경 불가능
		var.printNum(10);
		
	}
}
