import java.io.Serializable;

public class Point implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
	int b;

	public Point() {
		a = 0;
		b = 0;
	}
	
	public Point(int aa, int bb) {
		a = aa;
		b = bb;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
}

