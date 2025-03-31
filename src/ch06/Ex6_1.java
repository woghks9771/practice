package ch06;

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channeldown();
		System.out.println("현재 체널은 " + t.channel + " 입니다.");
	}

}

class Tv {
	// Tv의 속성(맴버변수)
	String color;		// 색상
	boolean power;		// 전원의 상태(on/off)
	int channel;		// 채널
	
	// Tv의 기능
	void power()	{ power = !power; }	// Tv를 켜거나 끄는 기능을 하는 메서드
	void channelup()	{ ++channel; }		// Tv의 채널을 높이는 기능을 하는 메서드
	void channeldown()	{ --channel; }		// Tv의 채널을 낮추는 기능을 하는 메서드
}