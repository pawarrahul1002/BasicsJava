import java.util.*;

class MaxMin{

	static int maxNum(int a, int b, int c)
	{
		if (a>b && a > c) 
		{
			return a;
		}
		else if (b>a && b>c) {
			return b;
		}
		else{
			return c;
		}
	}

	static int minNum(int a, int b, int c)
	{
		if (a<b && a < c) 
		{
			return a;
		}
		else if (b<a && b<c) {
			return b;
		}
		else{
			return c;
		}
	}


	public static void main(String[] args)
	{
		System.out.println("Enter three numbers");
		Scanner in = new Scanner(System.in);
		int x,y,z;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		int max = maxNum(x, y, z);
		System.out.println("Max Num : "+ max);
		int min = minNum(x,y,z);
		System.out.println("Min Num : "+ min);

	}
}