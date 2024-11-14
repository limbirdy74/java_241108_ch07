package ch08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.setVolume(8);
		audio.turnOn();
		
		RemoteControl rControl; // 선언만 가능(메모리에 인스턴스 X)
		
		rControl = tv;    //부모는 자식의 모든 것을 받아준다
		rControl = audio;
		
		RemoteControl rc1 = new Television(); // 본인 것으로는 메모리에 못 만들지만 자식을 가리킬수는 있다
		RemoteControl rc2 = new Audio();
		
	}

}
