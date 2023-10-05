
public class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog("KiKi");
		System.out.println("Dog's name: " + dog1.getName());
		dog1.Eat();
		dog1.MakeSound();
		//dog1.Sleeping();
		Cat cat1 = new Cat("Mi Mi");
		System.out.println("Cat's name: " + cat1.getName());
		cat1.Eat();
		cat1.MakeSound();
		//cat1.Sleeping();
	}

}
