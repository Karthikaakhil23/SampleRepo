package inheritance;

public class MultiLevelChild extends MultiLevelParent {
	public void display2()
	{
			System.out.println("class c");
	}

	public static void main(String[] args) {
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
