public class Aquarium
{
	public int length,height,width;

	public void fillFish()
	{
		fish fish1 = new fish();
		// fish1.color = "orange";
		// System.out.println("Many " + fish1.color + " fish here");

		fish1.SetColor("green");

		System.out.println("Many " + fish1.GetColor() + " fish here");

		fish1.Swim();
	}
}
