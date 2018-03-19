package PowerBall;

public class LottoMan {

	public static void main(String[] args) {

		LottoMan lm = new LottoMan();
		lm.run();
		
		
	}
	public void run() {
		
		PBManager pbm = new PBManager();
		pbm.getAndLoad();
		
	}
}
