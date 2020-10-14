public class fish 
{
	public String color = "green";

	public void Swim()
	{
		System.out.println(color + " fish swim");
	}

	public void SetColor(String warna) {
		color = warna;
	}

	public String GetColor() {
		return color;
	}
}