

public class RecursionIsCool {

	public static void main(String[] args) 
	{
		sayHi(5);
	}
	
	//Recursion is just a method being called inside of itself
	/*it needs a base case meaning it needs to know
	when to stop */
	public static void sayHi(int n) 
	{
		if(n == 0) 
		{
			System.out.println("Done Printing.");
		}
		else 
		{
			System.out.println("Hi");
			n--;
			sayHi(n);
		}
	}
}
