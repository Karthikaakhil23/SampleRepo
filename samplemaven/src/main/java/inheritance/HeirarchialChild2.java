package inheritance;

public class HeirarchialChild2 extends HierarchialParent {
	public void display2()
	{
		System.out.println("This is child class2");
	}	

	public static void main(String[] args) {
		
		HeirarchialChild2 obj = new HeirarchialChild2();
		obj.display();
		obj.display2();

	}

}
