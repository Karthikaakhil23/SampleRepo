package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city, String state, Aggregation1 ref) {
		this.city = city;
		this.state = state;	
		this.ref = ref;
	}
	public void display() {
		System.out.println(ref.name + " "+ref.rollno +" "+city+ " "+state);
		
	}
	public static void main(String[] args) {
		Aggregation1 obj1 = new Aggregation1("Karthika",20);
		Aggregation2 obj2 = new Aggregation2("tvm","kerala",obj1);
		obj2.display();
	}

}
