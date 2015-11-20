package net.Peixera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Peix {
	private static final int VELOCITAT = 2;
	GImage imatge;
	int Sexe;
	int Angle;
	boolean esMort = false;
		
	public Peix(GImage image, int Sexe, int Angle){
		imatge = image;
		this.Sexe = Sexe;
		this.Angle = Angle;
	}
	
	public void mou(){
		imatge.movePolar(VELOCITAT, Angle);
	}
	
	public void posicioPeix(int x, int y){
		imatge.setLocation(x, y);
	}
	
	public GRectangle tamanyPeix(){
		return imatge.getBounds();
	}
	
	public int ampladaPeix(){
		return (int) imatge.getWidth();
	}
	
	public int alturaPeix(){
		return (int) imatge.getHeight();
	}
	
	public boolean xocaPeix(Peix P){
		if (imatge.getBounds().intersects(P.tamanyPeix())) {
			return true;
		}
		return false; 
	}
	
	public void mortPeix() {
		esMort = true;
		imatge.setVisible(false);
	}
	
	public int getSexe() {
		return Sexe;
	}
		
	public int getAngle() {
		return Angle;
	}
	
	public boolean peixFregit() {
		return esMort;
	}

	public void setAngle(int angle) {
		Angle = angle;
	}

}