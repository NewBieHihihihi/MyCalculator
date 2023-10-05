package Main;

public class TestBox2 {
	public static void main(String[] args) {
		Box2 box2 = new Box2<Integer>(15);
		box2.setValue(20);
		System.out.println("Gia Tri Trong Box La: " + box2.getValue());
		box2 = new Box2<String>("Hello World.");
		System.out.println(box2.getValue());
		
	}

}
