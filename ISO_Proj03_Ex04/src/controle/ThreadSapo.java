package controle;

import java.util.Random;

public class ThreadSapo extends Thread{
	
	int [] winer; 
	int ID;
	
	public ThreadSapo(int i, int [] winer) {
		
		this.winer = winer;
		ID = i;
		
	}
	
	public void run() {
		
		corrida();
	}

	private void corrida() {
		int chegada = 800;
		int sapo = 0;
		int pulo = 0;
		Random rand = new Random();
		while(sapo < chegada) {
			pulo =  rand.nextInt(106);
			sapo = sapo + pulo;
			System.out.println("Sapo " + ID + " salta incriveis " + pulo + " metro(s)" );
			if (pulo == 0 | pulo == 1) {
				System.err.println("Parece que sapo " + ID + " quebrou as pernas!!");
			}
			if (sapo >= chegada) {
				System.err.println("\nE assim o sapo " + ID + " chega ao fim da corrida!!!\n");
				for(int i = 0; i < 5; i++) {
					if(winer[i] == 0) {
						winer[i] = ID;
						try {
							Thread.sleep(300);
						}
						catch(Exception e){
							System.err.println(e.getMessage());
						}
						System.out.println("\nO sapo " + ID + " chegou em " + (i + 1) + " lugar");
						break;
					}
					else {
						
					}
				}
			}
		}
	}
	
}