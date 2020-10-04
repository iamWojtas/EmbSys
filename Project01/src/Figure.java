
public abstract class Figure {
	protected Point origin;
	
	public Figure(Point ori) {
		this.origin = ori;
	}
	
	public Figure(int a, int b) {
		this.origin = new Point(a,b);
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
}
