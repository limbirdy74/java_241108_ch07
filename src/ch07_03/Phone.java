package ch07_03;

public abstract class Phone {  // 추상클래스
	
	// 추상메소드를 선언할 수 있다. 추상클래스 추상메소드 선언
	// 객체를 만들수 없다. 원인은 추상메소드
	
	//필드
	String owner;

	//생성자. 자식클래스에서 호출하는 생성자는 반드시 필요.
	public Phone() {
		super();
	}
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
//	public void powerType() {
//		System.out.println("전원 타입은 C Type입니다");
//	}
	// 추상메소드는 추상클래스에만 만듬. 접근제한자 반환타입 사이에 써줌. 추상메소드는 내용이없다. 중괄호 없음
	public abstract void powerType();  

}
