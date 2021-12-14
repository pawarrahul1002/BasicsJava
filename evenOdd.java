import java.util.*;  

class Main{

	public static void EvenOddChecker(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+ " is Even");
		}
		else
		{
			System.out.println(x+ " is Odd");
		}
	}

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		EvenOddChecker(num);
	}
}