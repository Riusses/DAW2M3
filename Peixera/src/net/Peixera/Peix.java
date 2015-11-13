package net.Peixera;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Peix {
	private static final int VELOCITAT = 2;
	GImage imatge;
	int Angle;
	
	public Peix(GImage image, int Angle){
		imatge = image;
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
	
	public int getAngle() {
		return Angle;
	}

	public void setAngle(int angle) {
		Angle = angle;
	}

}