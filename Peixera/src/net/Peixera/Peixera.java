package net.Peixera;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peixera {

	Random Aleatori = new Random();
	
	// MÈTODE CREACIÓ DE LA LLISTA DE PEIXOS

	List<Peix> Peixos = new ArrayList<Peix>();
	int Acaba = Peixos.size();

	public void mouPeixos() {
		for (Peix P : Peixos) {
			P.mou();
			peixeraParet(P);
		}
	}

	public void afegirPeix(Peix P) {
		Peixos.add(P);
	}

	public void colocarPeix() {
		for (Peix P : Peixos) {
			P.posicioPeix(Aleatori.nextInt(800), Aleatori.nextInt(600));
		}
	}
	
	// MÈTODE DE IF DE REPETICIÓ
	
	public void peixeraParet(Peix P) {
		if (P.tamanyPeix().getX() > 800) {
			int temp1 = (int) P.tamanyPeix().getX() + 1;
			int temp2 = temp1 % 800;
			int temp3 = temp2 - P.ampladaPeix();
			P.posicioPeix(temp3, (int) P.tamanyPeix().getY());
		}
		if (P.tamanyPeix().getY() > 600) {
			int temp1 = (int) P.tamanyPeix().getY() + 1;
			int temp2 = temp1 % 600;
			int temp3 = temp2 - P.alturaPeix();
			P.posicioPeix((int) P.tamanyPeix().getX(), temp3);
		}
		if (P.tamanyPeix().getX() < 0 - P.ampladaPeix()) {
			P.posicioPeix(800, (int) P.tamanyPeix().getY());
		}
		if (P.tamanyPeix().getY() < 0 - P.alturaPeix()) {
			P.posicioPeix((int) P.tamanyPeix().getX(), 600);
		}
	}

	// BUCLE INFINIT

	public boolean finalitzar() {
		if (Acaba == 1) {
			return false;
		}
		return true;
	}

}