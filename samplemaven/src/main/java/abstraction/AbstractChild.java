package abstraction;

public class AbstractChild extends AbstractParent {
	public void print() 
	{
		System.out.println("Abstract Child");
	}
	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.display1();
		obj.print();
	}

	@Override
	public void display() {
		System.out.println("Overriden method");
		
	}

}
