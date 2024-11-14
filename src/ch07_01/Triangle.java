package ch07_01;

public class Triangle extends Shape{

	String name;
	int point;
	
	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override  //annotation
	void area() {
		// TODO Auto-generated method stub
//		super.area(); // 기본으로 들어오는데 지워도됨
		System.out.println(width * height * 0.5);
//		super.area();  // 부모 area 메소드 호출
	}
	
	void superarea() {
		super.area();  // 부모 area 메소드 호출
	}
	
}
