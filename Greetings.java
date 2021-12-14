import java.util.*;
class Main
{

	public static void Greetings()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name ");
		String name = sc.nextLine();

		System.out.println("Hello " + name);

	}

	public static void main(String[] args)
	{
		Greetings();
	}
}