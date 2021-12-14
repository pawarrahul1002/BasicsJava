class IPLPlayer extends ICC{
	String pName = "Rahul Pawar";
	int runs = 800;
	static int totalRuns = 4489;

	IPLPlayer(){
		Show("*** Presenting IPL Player ***");
	}
	
	void Show(String something){
		System.out.println(something);
	}
	
	void PlayerInfo(){
		Show(pName);
		Show("IPL 2020 Runs : " + runs);
		Show("Total IPL runs : " + totalRuns);
	}
	
	public static void main(String[] args){
		IPLPlayer player = new IPLPlayer();
		player.PlayerInfo();
	}
}

class ICC extends BCCI
{
	ICC()
	{
		System.out.println("Calling ICC");
	}
}

class BCCI
{
	BCCI()
	{
		System.out.println("Calling BCCI");
	}
}