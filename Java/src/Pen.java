

public class Pen 
{
	String type = "gel";
	String color = "blue";
	int point = 10;
	
	static boolean clicked = false;
			
	public void click() 
	{
		clicked = true;
		System.out.print("Pen was clicked!");
	}
	
	public static void unclick() 
	{
		clicked = false;
	}
}
