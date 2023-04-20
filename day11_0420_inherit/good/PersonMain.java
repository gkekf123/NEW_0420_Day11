package day11_0420_inherit.good;

public class PersonMain {

	public static void main(String[] args) {

		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 40;
		t.name = "박인욱";
		t.subject = "자바";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 80;
		e.name = "이기성";
		e.department = "부사장";
		System.out.println(e.info());
		
	}

}
