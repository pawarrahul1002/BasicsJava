import java.util.*;

class Main{

	public static void Fibo(int count )
	{
 		int n1 = 0,n2 = 1;  


  
 		System.out.print(n1+" "+n2);	//printing 0 and 1    

		for (int i = 2; i<count; i++ ) 
		{
			int x = n1 + n2;
			System.out.print(" "+x );
			n1 = n2;
			n2 = x;
		}
	}

	// public static int FiboRecu(int num )
	// {
	// 	int FiboRecursive(num);
	// }


	public static int FiboRecursive(int num )
	{
		if(num<2)
		{
			return num;
		}

		return FiboRecursive(num-1) + FiboRecursive(num-2);
	}



	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number : ");
		int count = sc.nextInt();
		Fibo(count);

		System.out.println(" ");
		System.out.println(count + " pos number in fibo series : " +  FiboRecursive(count-1));
	}
}