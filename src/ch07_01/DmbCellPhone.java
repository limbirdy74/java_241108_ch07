package ch07_01;

public class DmbCellPhone extends CellPhone{
	// 필드
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);  // 부모 클래스의 생성자 호출
		// 부모 생성자가 없는 경우는 아래처럼, 부모 생성자를 만들어 놓았으면 위 처럼. 위 처럼 하는것을 더 강조함. 가독성이 좋음. 누구껀지 보기좋음.
//		this.model = model;  // 부모것도 내것처럼 this 로 하면된다
//		this.color = color;
		this.channel = channel;
	}
	
	public DmbCellPhone() {  // 기본생성자
		super();  // 부모 클래스의 생성자 호출
	}
	// 메소드
	void turnOnDmb() {
		System.out.println("dmb 전원을 켭니다.");
	}
	void turnOffDmb() {
		System.out.println("dmb 전원을 끕니다.");
	}
	void changeChennel() {
		System.out.println("dmb 채널을 변경합니다.");
	}
}
