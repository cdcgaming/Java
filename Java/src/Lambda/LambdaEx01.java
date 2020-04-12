package Lambda;

public class LambdaEx01
{

	public static void main(String[] args)
	{
		MyLambda lambdaFunc = () -> System.out.print("Hello World ..|.."); 
		lambdaFunc.foo();
	}

}

interface MyLambda
{
	void foo();
}
