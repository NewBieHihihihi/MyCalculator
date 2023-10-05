
public class Animal {
	private
	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void Eat()
	{
		System.out.println("Eat's something");
	}
	void MakeSound()
	{
		System.out.println("Sounding");
	}
	void Sleeping()
	{
		System.out.println("I'am Sleeping");
	}


}
