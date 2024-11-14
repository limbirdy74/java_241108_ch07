package ch08_01;

// interface는 extends 로 상속받지 않는다
public class Spider implements Monster{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("거미 달려");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("거미 걸어");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거미줄 쏴");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("거미 못 날아");
	}
	
	

}
