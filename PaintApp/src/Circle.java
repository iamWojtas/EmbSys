import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Ellipse {
	
	public Circle(int radius) {
		super(radius,radius);
	}
	
	public Circle(int px, int py, Color co) {
		super(px,py,co);
	}

	public void setAx1(int ax) {
		this.axis1 = ax;
		this.axis2 = ax;
	}

	public void setAx2(int ax) {
		this.axis1 = ax;
		this.axis2 = ax;
	}

	public void setBoundingBox(int heightBB, int widthBB) {
		setAx1(widthBB);
		setAx2(widthBB);
	}
	
	public void draw(Graphics g) {
		g.setColor(this.c);
		g.fillOval(this.origin.a, this.origin.b, this.axis1, this.axis2);
	}
}