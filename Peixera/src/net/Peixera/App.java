package net.Peixera;

import java.util.Random;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {
	private static final long serialVersionUID = 1L;
	private static final int[] DIRECCIO = { 0, 90, 180, 270 };
	Peixera Aigua;
	Random Aleatori = new Random();

	public void run() {
		setSize(800, 600);
		pause(50);

		Aigua = new Peixera();

		crearPeix();

		Aigua.colocarPeix();

		while (Aigua.finalitzar()) {
			pause(50);
			Aigua.mouPeixos();
		}
	}

	public void crearPeix() {
		GImage Peixicu;
		for (int i = 0; i < 20; i++) {
			int AnglePeixicu = DIRECCIO[Aleatori.nextInt(DIRECCIO.length)];
			int Sexe = Aleatori.nextInt(2);
			Peixicu = new GImage("peix" + Sexe + "" + AnglePeixicu + ".png");
			add(Peixicu);
			Peix Temp = new Peix(Peixicu, AnglePeixicu);
			Aigua.afegirPeix(Temp);
		}
	}
}