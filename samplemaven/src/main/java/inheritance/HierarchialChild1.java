package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public void display1()
	{
		System.out.println("This is child class1");
	}

	public static void main(String[] args) {
		
		HierarchialChild1 obj = new HierarchialChild1();
		obj.display();
		obj.display1();

	}

}
