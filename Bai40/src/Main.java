
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Ki Ki");
		System.out.println("Dog's Name: "+ dog.Ten());
		dog.Bark();
		dog.Eat();
		BabyDog baby  = new BabyDog();
		baby.setName("Sigma");
		System.out.println("BaByDog's Name: " + baby.Ten());
		baby.Eat();
		baby.Cry();
	}

}
