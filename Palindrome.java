import java.util.*;

class Main {

	public static void Palindrome(String str)
	{
		int i;
		for(i=0; i<str.length()/2 && str.charAt(i) == str.charAt(str.length()-i-1); i++);

		if(i == str.length()/2)
		{
    		System.out.println("Palindrome");
		}
		else
		{
    		System.out.println("Not Palindrome");
		}
	}
  public static void main(String[] args) 
  {
	  	Scanner sc = new Scanner(System.in);
	  	String str = sc.nextLine();
		Palindrome(str);
		sc.close();
  }
}