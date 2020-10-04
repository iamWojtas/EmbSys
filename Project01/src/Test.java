
public class Test {
	
	public static void main(String args[]) {
		Point p1 = new Point(5,5);

//		System.out.println(p1.getX());
//		System.out.println(p1.getY());

		Rectangle r1 = new Rectangle(p1);
		Rectangle r2 = new Rectangle(10,3);
		
		Square sq1 = new Square(4);
		

//		System.out.println();
//		System.out.println(p1.getY());

//		r1.getOrigin();
//		r2.getOrigin();
//		System.out.println(r2.displays());
//		r2.getOrigin();
//		
//		System.out.println(sq1);
//		sq1.setWidth(5);
//		System.out.println(sq1);
//		sq1.setLength(10);
//		System.out.println(sq1);
		
		Rectangle r3 = new Square(8);
		
		Figure[] tf = new Figure[4];
		tf[0] = new Ellipse(12,3);
		tf[1] = new Rectangle(8,3);
		tf[2] = new Square(4);
		tf[3] = new Circle(4);
		
		
		
		
	
	}
}
