package gameOfLife;

public class GameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spielfeld sf =new Spielfeld();
		sf.randomZustand();
		sf.printZustand();
		sf.check();
		System.out.println("........................................................");
		sf.printZustand();
		//sf.check();
	}

}
