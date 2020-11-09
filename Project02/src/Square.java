import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle{
	public Square(int w) {
		super(w, w);
	}
	
	public Square(int px, int py, Color co) {
		super(px,py,co);
	}
	
	public void setWidth(int a) {
		this.width = a;
		this.length = a;
	}
	
	public void setLength(int a) {
		this.width = a;
		this.length = a;
	}

	public void setBoundingBox(int heightBB, int widthBB) {
		setLength(widthBB);
		setWidth(widthBB);
	}
	
	public void draw(Graphics g) {
		g.setColor(this.c);
		g.fillRect(this.origin.a, this.origin.b, this.length, this.width);
	}
}
