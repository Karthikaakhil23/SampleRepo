package interfaceexample;

public class MultipleChild implements MultipleParent1, MultipleParent2 {
	public void display3()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.display1();
		obj.display2();
		obj.display3();

	}

	@Override
	public void display2() {
		System.out.println("Parent Interface2");
		
	}

	@Override
	public void display1() {
		System.out.println("Parent Interface1");
		
	}

}
