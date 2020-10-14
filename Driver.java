public class Driver {

	public static void main(String [] arg) {
		fish nemo = new fish();  
		nemo.Swim();
		nemo.SetColor("red");  
		nemo.Swim();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();
	}
}