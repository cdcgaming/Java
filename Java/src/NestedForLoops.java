

public class NestedForLoops 
{

	public static void main(String[] args) 
	{
		
		String[][] items = {{"apple","orange","lemon"}, {"square","circle","triangle"}};
		
		for(int row=0; row < items.length; row++) 
		{
			for(int column=0; column < items.length+1; column++) 
			{
				System.out.println(items[row][column]);
			}
		}
	}
}
