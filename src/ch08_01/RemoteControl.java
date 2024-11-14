package ch08_01;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10; // 상수선언
	public int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();  //추상 메소드(메소드 선언부만 작성)
	public void turnOff();
	public void setVolume(int volume);
	
}
