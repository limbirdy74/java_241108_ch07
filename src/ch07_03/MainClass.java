package ch07_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone phone = new Phone(); // 추상클래스라 오류남
		
		SmartPhone smartPhone = new SmartPhone(); // 1층에 폰. 2층에 스마트폰 
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.powerType();
		
	}

}
