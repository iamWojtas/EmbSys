
public class Rectangle {

	private Point origin;
	private int width;
	private int length;
	
	public Rectangle(Point org) {
		origin = org;
	}
	
	public Rectangle(int w, int l) {
		setWidth(w);
		setLength(l);
		origin = new Point(0,0);
	}
	
	public void getOrigin() {
		System.out.println("Origin: "+this.origin.getX()+", "+this.origin.getX());
	}
	
	public int getPerimetre() {
		return 2*this.length+2*this.width;
	}
	public int getSurface() {
		return this.width*this.length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
