public class FizzBuzz
{
	public static void main(String[] args)
	{
		for(int x = 1; x <= 100; x++)
		{
			int y = x % 3;
			int z = x % 5;
			if(y == 0 && z == 0)
				System.out.println("FizzBuzz");
			else if(y == 0)
				System.out.println("Fizz");
			else if(z == 0)
				System.out.println("Buzz");
			else
				System.out.println(x);
		}			
	}
}