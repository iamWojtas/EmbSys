import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Figure{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int axis1;
	protected int axis2;
	protected String name;
	
	public Ellipse() {
		super();
		this.setName("Ellipse");
	}
	
	public Ellipse(int ax1, int ax2) {
		super();
		this.axis1 = ax1;
		this.axis2 = ax2;
		this.setName("Ellipse");
	}
	
	public Ellipse(int px, int py, Color c) {
		super(px,py,c);
		this.axis1 = 0;
		this.axis2 = 0;
		this.setName("Ellipse");
	}	
	
	public double getPerimeter() {
		return 2*3.1415d*sqrt((pow(this.axis1,2)+pow(this.axis2,2))/2);
	}
	
	public double getSurface() {
		return 3.1415d*this.axis1*this.axis2/4;
	}
	

	
	public int getWidth() {
		return this.axis1;
	}

	public void setWidth(int ax1) {
		this.axis1 = ax1;
	}
	
	public int getLength() {
		return this.axis2;
	}

	public void setLength(int ax2) {
		this.axis2 = ax2;
	}

	public void setBoundingBox(int heightBB, int widthBB) {
		setWidth(heightBB);
		setLength(widthBB);
	}
	
	public void draw(Graphics g) {
		g.setColor(this.c);
		g.fillOval(this.origin.a, this.origin.b, this.axis1, this.axis2);
	}
	
	public String saveString() {
		String out = new String();
		out+=this.getColor()+" ";
		out+=this.name+" (";
		out+=(String.valueOf(this.origin.a)+",");
		out+=(String.valueOf(this.origin.b)+") (");
		out+=(String.valueOf(this.axis1)+",");
		out+=(String.valueOf(this.axis2)+")\n");

		return out;
		
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String nn) {
		this.name = nn;
	}
}
