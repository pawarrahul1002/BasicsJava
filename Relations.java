class Kaka
{
	public static void main(String[] args){


		System.out.println("Baba's Opinion");
		Baba b = new Baba();
		b.GetProperty();
		b.Career();
		b.Marridge();


		System.out.println("Rahul's Opinion");

		Rahul R = new Rahul();
		R.GetProperty();
		R.Career();
		R.Marridge();


		System.out.println("Conflict's Opinion");

		Baba K = new Rahul();
		K.GetProperty();
		K.Career();
		K.Marridge();

	}
}

class Baba{

	void GetProperty()
	{
		System.out.println("Banglow");
	}

	void Career()
	{
		System.out.println("Doctor");
	}

	void Marridge()
	{
		System.out.println("KK");
	}
}

class Rahul extends Baba{

	void Career(){
		System.out.println("Engineer");
	}

	void Marridge()
	{
		System.out.println("RR");
	}


}

