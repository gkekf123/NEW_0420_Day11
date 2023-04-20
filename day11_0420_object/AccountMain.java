package day11_0420_object;

public class AccountMain {

	public static void main(String[] args) {

		Account ac = new Account("123 - 123456", "1234", 10000);
	
		ac.deposit(-5000);	// 입금
		ac.withDraw(1000);	// 출금
		// int num = scan.nextInt(); 와 같음
		int balance = ac.getbalance();	//잔고 확인
		System.out.println(balance);
		
	}

}
