import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ellipse extends Figure{
	protected double axis1;
	protected double axis2;
	
	public Ellipse(double ax1, double ax2) {
		super();
		this.axis1 = ax1;
		this.axis2 = ax2;
	}
	
	public double getPerimeter() {
		return 2*3.1415d*sqrt((pow(this.axis1,2)+pow(this.axis2,2))/2);
	}
	
	public double getSurface() {
		return 3.1415d*this.axis1*this.axis2/4;
	}
	
	public double getAx1() {
		return this.axis1;
	}

	public void setAx1(int ax1) {
		this.axis1 = ax1;
	}
	
	public double getAx2() {
		return this.axis2;
	}

	public void setAx2(int ax2) {
		this.axis2 = ax2;
	}
}
