import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Figure implements Serializable{
	protected Point origin;
	protected Color c;
	
	public Figure(Point ori) {
		this.origin = ori;
	}
	
	public Figure(Point ori, Color cc) {
		this.origin = ori;
		this.c = cc;	
	}
	
	public Figure(int a, int b) {
		this.origin = new Point(a,b);
	}
	
	public Figure(int a, int b, Color co) {
		this.origin = new Point(a,b);
		this.c = co;
	}
	
	
	public Figure() {
		this.origin = new Point(0,0);
	}
	
	public Point getOrigin() {
		return this.origin;
	}
	
	public String toString() {
		return "Origin: "+this.origin.getX()+", "+this.origin.getX();
	}

	public abstract double getSurface();
	public abstract double getPerimeter();
	
	public abstract void setBoundingBox(int heightBB, int widthBB);
	public abstract void draw(Graphics g);
	public abstract String saveString();
	public String getColor() {
		String tempo = new String();
		
		switch(this.c.getRGB()) {
		case -16777216: {
			tempo = "Black";
			break;
		}
		case -65536: {
			tempo = "Red";
			break;
		}
		case -16711936: {
			tempo = "Green";
			break;
		}
		case -16776961: {
			tempo = "Blue";
			break;
		}
		case -256: {
			tempo = "Yellow";
			break;
		}
		case -20561: {
			tempo = "Pink";
			break;
		}
		case -65281: {
			tempo = "Magenta";
			break;
		}
		case -14336: {
			tempo = "Orange";
			break;
		}
	}
		return tempo;
	}
	
}
