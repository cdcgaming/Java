
import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) 
	{
		printItems();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		for(int num : numbers) 
		{
			System.out.println(num);
		}
	}

	private static void printItems() 
	{
		String[] cars = {"BMW", "Toyota", "GTX"};
		for(String car : cars) 
		{
			System.out.println(car);
		}
	}
}
