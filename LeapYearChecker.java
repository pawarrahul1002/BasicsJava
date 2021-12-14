import java.util.*;  

class Main 
{

	static boolean CheckLeap(int y)
	{
		if(y % 4 == 0)
		{
			if(y % 100 == 0)
			{
				if(y % 400 == 0)
				{
					return  true;
				}
				else
				{
					return  false;
				}
			}
			else
			{
				return  true;
			}

		}
		else
		{
			return  false;
		}
	}

  	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);  
		System.out.println("enter year to check");
		int year = sc.nextInt(); 
		sc.close();

    	System.out.println("is Leap year  " + CheckLeap(year));

  	}
}