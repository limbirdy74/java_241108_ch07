package ch07_02;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();   // 부모클래스
		Driver1 driver1 = new Driver1(); // 자식클래스
		
		driver = driver1;  // 부모는 자식의 모든 것을 받아준다!!
		driver1 = (Driver1) driver;  // 강제형변환(캐스팅) 으로 가능하긴 해짐. 2층이 1층이 되면서 손실이 올수도. 많지 않은 경우
	}

}
