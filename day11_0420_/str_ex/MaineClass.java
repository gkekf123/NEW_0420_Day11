package day11_0420_.str_ex;

public class MaineClass {

	public static void main(String[] args) {

		
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("==================================");
		
		// 같은 파이에서 언선한 홍길동은 같은 객체 참조
		System.out.println(str1 == str2); 
		// 작좁 생성명령을 내리거나 다른클래스에서 넘어온 String은 다른 주소를 나타내게 된다
		System.out.println(str1 == str3); 
		// 문자열 동등비교시는 == 대신에 equals() 메서드를 사용해서 비교해야한다
		
		// null safety(널 안전성)이 없어서 에러를 발생시킬 수 있음
		if(str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		
		if(str1 != null && str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		
		
		
	}

}
