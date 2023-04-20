package day11_0420_object;

public class Tv {

	String companay = "LG";	//제조사
	int channel;	//채널
	boolean power;	//전원
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 x번을 받아서 채널을 변경, 변경 된 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작 될 수 있도록
	 * 
	 */
	
	int changeChannel(int x) {
		channel = x;
		System.out.println("변경 된 채널 : " + channel);
		return channel;
	}
	
	void power() {
		if(power) {
			power = false;
			System.out.println("OFF");
		} else {
			power = true;
			System.out.println("ON");
		}
	}
	
}
