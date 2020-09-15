package interação;

import controle.ThreadSapo;

public class MainSapo {

	public static void main(String[] args) {

		int [] winer = new int [5];
		for(int i = 0; i < 5; i++) {
			winer[i] = 0;
		}
		for (int i = 1; i <= 5; i++) {
			ThreadSapo sapo = new ThreadSapo(i, winer);
			sapo.start();
		}
	}

}
