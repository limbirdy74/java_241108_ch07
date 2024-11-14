package ch07_03;

public class Dog extends Animal{

	
	public Dog() {
		super();
	}

	
	public Dog(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound = "멍멍멍";
		return sound;
	}
	
	
}
