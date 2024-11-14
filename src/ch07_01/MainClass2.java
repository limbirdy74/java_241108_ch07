package ch07_01;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		Square square = new Square();
		Triangle triangle = new Triangle(10, 20);
		
		shape = square;  // 대입성공
//		square = shape;  // 대입실패 
		// shape 일층집 square 이층집
		Shape shape2 = triangle; // 선언과 동시에 받을 수도 있음.  자동 타입 변환 자식객체 -> 부모객체
		shape2.area();  // 오버라이딩 된 경우에는 자식것이 실행이된 것임
		// 중요. 부모는 자식의 모든 것을 받아준다
		
//		triangle = square;  // 안됨 굳이 할 필요도 없고
	}

}
