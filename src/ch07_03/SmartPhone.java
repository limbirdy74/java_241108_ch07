package ch07_03;

public class SmartPhone extends Phone{ //추상클래스의 추상메소드를 반드시 구현해야 함. 아니면 오류남
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String owner) {
		super(owner); 
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

	//추상클래스의 추상메소드를 반드시 오버라이딩해야 한다.
	@Override
	public void powerType() {
		// TODO Auto-generated method stub
		System.out.println("전원은 C type 입니다");
		
	}
	
	
	
}
