package ch07_01;

public class Shape {  //public final class Shape  이렇게 하면 상속불가 클래스가 됨. 만들 일은 없음
	
	// 필드
	int width;
	int height;
	String color;
	
	
	public Shape() {
		super();
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	void area() {
		System.out.println(width * height);
	}
	
	final void color() {  // 오버라이딩 불가 메소드 선언. 재정의 불가
		System.out.println(color);
	}

}
