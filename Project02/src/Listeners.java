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
			myDrawing.changeName("Cercle");
		}
		else if(cmd.equals("Ellipse")) {
			System.out.println("Its Ellipse here");
			myDrawing.changeName("Ellipse");
		}
		else if(cmd.equals("Carre")) {
			System.out.println("Its Carre here");
			myDrawing.changeName("Carre");
		}
		else if(cmd.equals("Quit")) {
			System.exit(0);
		}
		else {
			System.err.println(cmd);
		}
	}
}
