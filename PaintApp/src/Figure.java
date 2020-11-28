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
	
	
}
