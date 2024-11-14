package ch08_01;

public interface Monster {  // 인터페이스 -> 인스턴스(객체)로 만들 수 없음
	//필드 못 만듬
	int health = 300; // 초기값이 없는 필드선언은 오류남. 상수화됨
	
	//셍성자 못 만듬
	
	//메소드
//	public void run() {
//		System.out.println("run");
//	}
	// 인터페이스는 추상메소드만 만들 수 있다.
	public void run();  //추상메소드
	public void walk();
	public void attack();
	public void fly();
}

//인터페이스 특징
//1. 인스턴스(객체) 생성 불가능(new 연산자 사용 X) -> 상속전용
//2. 상수만 선언 가능
//3. 추상메소드만 선언 가능
//4. implements 로 상속(구현)

//필수로 구현해야 하는 메소드들을 정의. 각 클래스에서 오버라이딩해라
//표준을 강제. 필수요소를 강제하는 용도