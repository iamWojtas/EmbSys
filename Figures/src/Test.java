import java.util.concurrent.ThreadLocalRandom;
public class Test {
	
	public static void main(String args[]) {
		Point p1 = new Point(5,5);

		System.out.println(Integer.parseInt(args[0]));
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
		
//		Rectangle r3 = new Square(8);
//		
//
//		tf[0] = new Ellipse(12,3);
//		tf[1] = new Rectangle(8,3);
//		tf[2] = new Square(4);
//		tf[3] = new Circle(4);
		
		int n = Integer.parseInt(args[0]);
		
		Figure[] tf = new Figure[n];
		for(int i = 0; i < n; i++)
		{
			int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
			switch(randomNum) {
				case 0:
				    tf[i] = new Ellipse(12,3);
					break;
				case 1:
					tf[i] = new Rectangle(8,3);    
					break;
				case 2:
					tf[i] = new Square(4);    
					break;
				case 3:
					tf[i] = new Circle(4);    
					break;
			}
			
			System.out.println(i + ":  " + tf[i].getSurface());
		}
		
		
		
	
	}
}
