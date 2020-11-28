import java.io.Serializable;

public class Point implements Serializable{
	int a;
	int b;

	public Point(int aa, int bb) {
		a = aa;
		b = bb;
	}
	
	public int getX() {
		return this.a;
	}
	
	public int getY() {
		return this.b;
	}
	
	
}

