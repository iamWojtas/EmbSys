import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Figure implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Point origin;
	protected Color c;
	protected String color;
	
	public Figure(Point ori) {
		this.origin = ori;
		this.c = Color.black;
		this.color = this.getColor();
	}
	
	public Figure(Point ori, Color cc) {
		this.origin = ori;
		this.c = cc;	
		this.color = this.getColor();
	}
	
	public Figure(int a, int b) {
		this.origin = new Point(a,b);
		this.c = Color.black;
		this.color = this.getColor();
	}
	
	public Figure(int a, int b, Color co) {
		this.setOrigin(new Point(a,b));
		this.setC(co);
		this.setColor(this.getColor());
	}
	
	
	public Figure() {
		this.origin = new Point(0,0);
		this.c = Color.black;
		this.color = this.getColor();
	}

	public Point getOrigin() {
		return this.origin;
	}
	public void setOrigin(Point p) {
		this.origin = p;
	}
	
	public String toString() {
		return "Origin: "+this.origin.getA()+", "+this.origin.getB();
	}

	public abstract double getSurface();
	public abstract double getPerimeter();
	public abstract int getWidth();
	public abstract int getLength();
	public abstract void setWidth(int g);
	public abstract void setLength(int g);
		
	public abstract String getName();
	public abstract void setName(String nn);
		
	public abstract void setBoundingBox(int heightBB, int widthBB);
	public abstract void draw(Graphics g);
	public abstract String saveString();
	
	public Color getC() {
		return this.c;
	}
	public void setC(Color cc) {
		this.c = cc;
	}
	
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
	public void setColor(String cc) {
		this.color = cc;
	}
}
