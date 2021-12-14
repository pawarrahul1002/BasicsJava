import java.util.*;

class Main{

	public static void SimpleIntrest(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount, rate, time");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();

		float si = (p*r*t)/100;

		System.out.println("Simple Intrest : " + si);

	}

	public static void main(String[] args){
		SimpleIntrest();
	}
}