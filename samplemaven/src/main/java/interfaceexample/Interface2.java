package interfaceexample;

public class Interface2 implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj = new Interface2();
		obj.display();
		obj.display1();
		

	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}

}
