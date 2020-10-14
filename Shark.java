public class Shark extends fish
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
}