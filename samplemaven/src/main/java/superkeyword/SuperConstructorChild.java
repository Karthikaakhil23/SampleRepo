package superkeyword;

public class SuperConstructorChild extends SuperConstructor  {
	public SuperConstructorChild() {
		super(2,3);
		System.out.println("Childclass constructor");
	}
	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();

	}

}
