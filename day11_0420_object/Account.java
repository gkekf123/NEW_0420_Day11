package day11_0420_object;

public class Account {

	// 한 사람의 은행 계좌
	/*
	 *  1. accountNumber변수 - 식별 아이디
	 *  2. password변수 - 비밀번호
	 *  3. balance변수 - 잔고
	 *  
	 *  생성자
	 *  매개변수 3가지를 모두 받아서 초기화 하는 생성자
	 *  
	 *  메서드
	 *  deposit : void - 잔고에 매개변수를 누적하는 기능
	 *  withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 *  getBalance : int - 잔고가 리턴하는 기능
	 *  
	 *  메인 클래서에서는 각각의 기능을 확인
	 *  
	 */
	
	String accountNumber;
	String password;
	int balance;

	//생성자
	Account(String num, String pw, int bal) {
		accountNumber = num;
		password = pw;
		balance = bal;
	}
	
	void deposit(int money) {
		// 매개변수가 양수 일때만 가능하도록 변경
		if(money > 0) {
			System.out.println(money + " 원 입금");
		balance += money;
		} else {
			System.out.println("입금액이 0보다 작을 수 없습니다.");
		}
	}
	
	void withDraw (int money) {
		// 잔고가 0보다 클때만 출금이 가능하도록 변경
		if(balance >=  money ) {
			System.out.println(money + " 원 출금");
			balance -= money;
		}else {
			System.out.println("잔고가 부족하여 출금할 수 없음" + " / 잔고는 : " + balance);
		
		}
	}
	
	int getbalance() {
		return balance;
	}
	
}
