package net.Peixera;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peixera {

	Random Aleatori = new Random();

	// MÈTODE CREACIÓ DE LA LLISTA DE PEIXOS

	List<Peix> Peixos = new ArrayList<Peix>();
	int Acaba = Peixos.size();

	public void mouPeixos(int X, int Y) {
		for (Peix P : Peixos) {
			P.mou();
			peixeraParet(P, X, Y);
		}
	}

	public void afegirPeix(Peix P) {
		Peixos.add(P);
	}

	public void colocarPeix(int X, int Y) {
		for (Peix P : Peixos) {
			P.posicioPeix(Aleatori.nextInt(X), Aleatori.nextInt(Y));
		}
	}

	// MÈTODE DE IF DE REPETICIÓ

	public void peixeraParet(Peix P, int X, int Y) {
		if (P.tamanyPeix().getX() > X) {
			int temp1 = (int) P.tamanyPeix().getX() + 1;
			int temp2 = temp1 % X;
			int temp3 = temp2 - P.ampladaPeix();
			P.posicioPeix(temp3, (int) P.tamanyPeix().getY());
		}
		if (P.tamanyPeix().getY() > Y) {
			int temp1 = (int) P.tamanyPeix().getY() + 1;
			int temp2 = temp1 % Y;
			int temp3 = temp2 - P.alturaPeix();
			P.posicioPeix((int) P.tamanyPeix().getX(), temp3);
		}
		if (P.tamanyPeix().getX() < 0 - P.ampladaPeix()) {
			P.posicioPeix(X, (int) P.tamanyPeix().getY());
		}
		if (P.tamanyPeix().getY() < 0 - P.alturaPeix()) {
			P.posicioPeix((int) P.tamanyPeix().getX(), Y);
		}
	}

	// PEIXOS XOQUEN

	/*public void peixosXoquen(Peix P) {
		if (P ){
		//	
		}
	}*/

	// BUCLE INFINIT

	public boolean finalitzar() {
		if (Acaba == 1) {
			return false;
		}
		return true;
	}

}