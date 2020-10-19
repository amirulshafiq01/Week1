public class Driver {

	public static void main(String [] arg) 
	{
		Fish nemo = new Fish();  
		nemo.Swim();
		nemo.SetColor("red");  
		nemo.Swim();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.Swim(3);
		fiery.Swim(2,1);
		fiery.SetSharpTeeth(130);
		fiery.Eat();
	}
}