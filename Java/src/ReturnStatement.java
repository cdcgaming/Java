

public class ReturnStatement 
{

	public static void main(String[] args) 
	{
		int sum = add(4,6);
		System.out.println(sum);
		
		int[] items = array(2,4,6);
		
		for(int i=0; i < items.length; i++) 
		{
			System.out.println(items[i]);
		}	
	}
	
	public static int add(int a, int b) 
	{
		return a + b;
	}
	
	public static int[] array(int a, int b, int c) 
	{
		int[] items = {a, b, c};
		return items;
	}
}
