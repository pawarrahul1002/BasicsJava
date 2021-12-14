class Covid19 extends ForPrintTest
{
	Covid19()
	{
		System.out.println("Covid19 Constructor");
	}
	
	public static void main(String[] args)
	{
		Covid19 co = new Covid19();
		//ForPrintTest f = new ForPrintTest();
		//ForPrintTest.JustPrint();
		//Dhule.CityName();
		//System.out.println("this is main output");
	}
}

class ForPrintTest extends Dhule
{
	ForPrintTest()
	{
		System.out.println("ForPrintTest Constructor");
	}
	
	public static void JustPrint()
	{
		System.out.println("This is just print");
	}
		
	
	
}

class Dhule
{
	Dhule(){
		System.out.println("This is Dhule constructor");
	}
	public static void CityName()
	{
		System.out.println("This is Dhule class fun");
	}
	
}