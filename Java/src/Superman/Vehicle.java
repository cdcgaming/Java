package Superman;

class Vehicle
{
	int maxSpeed = 120;
	String parent = "From Parent Class : var";
	
	Vehicle()
	{
		System.out.println("From Vehicle Constructor");
	}
	
	public void EngineStart()
	{
		System.out.println("Starting Engine!");
	}
}

/*Java does't encourage you to make multiple classes
 * on the same file so "public" keyword was  omitted
 * on classes
 */
class Car extends Vehicle
{
	int maxSpeed = 200;
	
	//calling super construction
	Car()
	{
		super();
		System.out.println("Car Constructor");
	}
	
	public void printCarModel()
	{
		System.out.println("From Child Class : Tesla");
	}
	
	public void childMethod()
	{
		System.out.println(super.parent);
	}
	
}

