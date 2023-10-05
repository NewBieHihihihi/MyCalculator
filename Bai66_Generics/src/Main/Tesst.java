package Main;

public class Tesst {
	public static void main(String[] args) {
		Box a1 = new Box(8);
		a1.setValue(10);
		Box a2 = new Box(9);
		System.out.println(a1.getValue() + a2.getValue());
		
	}
}
