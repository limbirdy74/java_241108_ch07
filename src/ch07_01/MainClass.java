package ch07_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "블랙", 10);
		// 생성자를 통해서 부모객체에서 물려 받은 필드까지 한버넹 초기화
		System.out.println(dmbCellPhone.color);
		
		Square square = new Square(10,20);
		square.area();
		
		Triangle triangle = new Triangle(10, 20);
		triangle.area();
		
		int b;
		byte c = 10;
		
		b = c; // 대입가능
//		c = b; // 대입불가능
		c = (byte) b;  // 흰트를 이용해서. 완전 바뀐게 아니라 임시로 바꾸어준것
		
		int d = 10000;
		byte e;
		e = (byte) d;
		
		System.out.println(e); // 16이 반환됨

	}

}
