package ch07_03;

public abstract class Animal {

	//필드
	public String kind; // 동물종류
	
	public Animal() {
		super();
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract String sound(); //추상메소드
}

// 추상클래스인 Animal을 상속받는 Cat, Dog 클래스를 만드시오.
// 단, 부모 클래스의 kind를 초기화하는 생성자를 클래스 내에 생성하시오
