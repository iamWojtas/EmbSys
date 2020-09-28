
public class Test {
	
	public static void main(String args[]) {
		Point p1 = new Point(5,5);

		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		System.out.println();

		Rectangle r1 = new Rectangle(p1);
		Rectangle r2 = new Rectangle(4,4);
		
		System.out.println();
		System.out.println(p1.getY());

		r1.getOrigin();
		r2.getOrigin();
	}
}
