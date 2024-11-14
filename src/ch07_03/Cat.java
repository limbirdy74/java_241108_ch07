package ch07_03;

public class Cat extends Animal{

	
	public Cat() {
		super();
	}
	
	public Cat(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound = "야옹야옹";
		return sound;
	}
	
	
}
