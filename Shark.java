public class Shark extends Fish
{
	private int sharpTeeth = 50;

	public void Eat()
	{
		System.out.println("Eat with " + sharpTeeth + " number of teeth");
	}

	public void SetSharpTeeth(int teeth)
	{
		sharpTeeth = teeth;
	}
	public void Swim()
	{
		System.out.println("Fish swim with mouth open with " + sharpTeeth);
	}
	public void Swim(int fin)
	{
		System.out.println("Fish swim " + fin);
	}
	public void Swim(int eye,int mouth)
	{
		System.out.println("Shark has a " + eye + " eye and " + mouth + " mouth");
	}
}