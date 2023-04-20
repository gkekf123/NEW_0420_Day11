package day11_0420_Quiz;

public class DmbPhone  extends Phone{
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		int channel;
		boolean power;
		
		DmbPhone (String a, String b, int c)	 {
			color = a;
			model = b;
			channel = c;
		}
		void turnOnDmb()	{
			if(power) {
				power = false;
				System.out.println("TV ON");
			}
		}
		int changeChannel(int x) {
			channel = x;
			System.out.println("변경 된 채널은 : " + channel);
			return channel;
		}
		void turnOffDmb() {
			if(power) {
				power = true;
				System.out.println("TV ON");
			}
		}
		
		

}
