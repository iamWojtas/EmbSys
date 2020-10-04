
public class Rectangle extends Figure{


	protected int width;
	protected int length;
	
	public Rectangle(Point org) {
		super(org);
		this.setWidth(1);
		this.setLength(2);
	}
	
	public Rectangle(int w, int l) {
		super(0,0);
		this.setWidth(w);
		this.setLength(l);

	}
	

	public double getPerimeter() {
		return 2*this.length+2*this.width;
	}
	public double getSurface() {
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
	
	public String toString() {
		String a = new String();
		String hor = new String();
		String ver = new String();
		
		hor = "+";
		ver = "|";
		for (int g = 0; g < getWidth(); g++) {
			 hor += "--";
			 ver += "  ";
		}
		hor += "+";
		ver += "|";
		
		a += hor + "\n";
		for (int g = 0 ; g < getLength(); g++) {
			a += ver;
			a += "\n";
		}
		a += hor;
		
		
		return a;
	}
}
