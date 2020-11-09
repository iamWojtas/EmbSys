import java.awt.Color;
import java.awt.event.*;

public class Listeners implements ActionListener {
	
	private final Drawing myDrawing;
	
	public Listeners(final Drawing myDrawing) {
		super();
		this.myDrawing = myDrawing;
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Sud")) {
			System.out.println(" bouton presse = " + cmd);
		}
		else if(cmd.equals("Rectangle")) {
			System.out.println("Its Rectangol here");
			myDrawing.changeName("Rectangle");
		}
		else if(cmd.equals("Cercle")) {
			System.out.println("Its Cercle here");
			myDrawing.changeName("Circle");
		}
		else if(cmd.equals("Ellipse")) {
			System.out.println("Its Ellipse here");
			myDrawing.changeName("Ellipse");
		}
		else if(cmd.equals("Carre")) {
			System.out.println("Its Carre here");
			myDrawing.changeName("Square");
		}
		else if(cmd.equals("Quit")) {
			System.exit(0);
		}
		
		//colors
		else if(cmd.equals("Noir")) {
			System.out.println("Black");
			myDrawing.changeColor(Color.black);
		}
		else if(cmd.equals("Bleu")) {
			System.out.println("Blue");
			myDrawing.changeColor(Color.blue);
		}
		else if(cmd.equals("Rouge")) {
			System.out.println("Red");
			myDrawing.changeColor(Color.red);
		}
		else if(cmd.equals("Vert")) {
			System.out.println("Green");
			myDrawing.changeColor(Color.green);
		}
		else if(cmd.equals("Jaune")) {
			System.out.println("Yellow");
			myDrawing.changeColor(Color.yellow);
		}
		else if(cmd.equals("Rose")) {
			System.out.println("Pink");
			myDrawing.changeColor(Color.pink);
		}
		else if(cmd.equals("Orange")) {
			System.out.println("Orange");
			myDrawing.changeColor(Color.orange);
		}
		else if(cmd.equals("Magenta")) {
			System.out.println("Magenta");
			myDrawing.changeColor(Color.magenta);
		}
		
		//menu
		else if(cmd.equals("New")) {
			myDrawing.newDrawing();
		}
		else {
			System.err.println(cmd);
		}
	}
	
}
