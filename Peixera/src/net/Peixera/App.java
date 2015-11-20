package net.Peixera;

import java.awt.Color;
import java.util.Random;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {
	private static final long serialVersionUID = 1L;

	// ANGLES DELS PEIXOS

	private static final int[] DIRECCIO = { 0, 90, 180, 270 };

	// AMPLADA DE LA APP

	private static final int AMPLADAPEIXERA = 800;

	// ALÇADA DE LA APP

	private static final int ALÇADAPEIXERA = 600;

	// PEIXOS QUE VOLS POSAR A LA APP

	private static final int PEIXICUS = 30;

	Peixera Aigua;
	Random Aleatori = new Random();

	public void run() {
		setSize(AMPLADAPEIXERA, ALÇADAPEIXERA);
		pause(50);
		Aigua = new Peixera();
		crearPeix();
		Aigua.colocarPeix(AMPLADAPEIXERA, ALÇADAPEIXERA);
		while (Aigua.finalitzar()) {
			pause(50);
			Aigua.mouPeixos(AMPLADAPEIXERA, ALÇADAPEIXERA);
		}
	}

	public App() {
		setBackground(Color.getHSBColor(25, 50, 250));
	}
	
	// CREACIÓ DE PEIXOS

	public void crearPeix() {
		GImage Peixicu;
		for (int i = 0; i < PEIXICUS; i++) {
			int AnglePeixicu = DIRECCIO[Aleatori.nextInt(DIRECCIO.length)];
			int Sexe = Aleatori.nextInt(2);
			Peixicu = new GImage("peix" + Sexe + "" + AnglePeixicu + ".png");
			add(Peixicu);
			Peix Temp = new Peix(Peixicu, Sexe, AnglePeixicu);
			Aigua.afegirPeix(Temp);
		}
	}
}