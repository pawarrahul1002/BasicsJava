import java.util.*;

class voter
{
	static void VotingElligibilityChecker(int a)
	{
		if (a>=18) 
		{
			System.out.println("You are elligible for vote");
		}
		else
		{
			System.out.println("You are not elligible for vote");
		}
	}

	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);

		System.out.println("Enter age");
		int age = in.nextInt();
		VotingElligibilityChecker(age);
	}
}