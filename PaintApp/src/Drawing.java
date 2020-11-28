import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener{
	Drawing(){
		super();
		
		c = Color.black;
		this.nameFigure = "Rectangle";
		this.list = new ArrayList<Figure>();
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		setBackground(Color.white);
		
		for(Figure figg: list) {
			figg.draw(g);
		}

	}

	
	
	
	private ArrayList<Figure> list;
	private Color c;
	private String nameFigure;
	private int xc;
	private int yc;

	private int xr;
	private int yr;
	
	public void newDrawing() {
		this.list.removeAll(list);
		this.repaint();
	}
	
	public void changeColor(Color cc){
		this.c = cc;
	}
	public void changeName(String nF){
		this.nameFigure = nF;
	}
	public void getRefList() {
		System.out.println(this.list.toString());
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		
		this.xc = arg0.getX();
		this.yc = arg0.getY();
		
		switch(nameFigure) {
			case "Rectangle": {
				list.add((Figure) new Rectangle(this.xc, this.yc, this.c));
				break;
			}
			case "Ellipse": {
				list.add((Figure) new Ellipse(this.xc, this.yc, this.c));
				break;
			}
			case "Square": {
				list.add((Figure)(Rectangle) new Square(this.xc, this.yc, this.c));
				break;
			}
			case "Circle": {
				list.add((Figure)(Ellipse) new Circle(this.xc, this.yc, this.c));
				break;
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {

	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.xr = arg0.getX() - this.xc;
		this.yr = arg0.getY() - this.yc;
		this.list.get(list.size()-1).setBoundingBox(Math.abs(this.xr), Math.abs(this.yr));
		this.repaint();
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
//		System.out.println("I unpressedn't");

	}

	public void saveScreen() {
	    
		try {

	        FileOutputStream file = new FileOutputStream("file.tmp");

	        // Creates an ObjectOutputStream
	        ObjectOutputStream output = new ObjectOutputStream(file);

	        // writes objects to output stream

			System.out.println("liczba figur: " + this.list.size());
	        //output.writeInt(this);
	        output.writeObject(this);

			System.out.println("zapisal siurewski");
	        output.close();
	    }

	    catch (Exception e) {
	        e.getStackTrace();
	        System.out.println(e);
	    }
	}
	
	public void loadScreen() {
		System.out.println("fczytuje siurewski");
		try {

	        // Reads data using the ObjectInputStream
	        FileInputStream fileStream = new FileInputStream("file.tmp");
	        ObjectInputStream objStream = new ObjectInputStream(fileStream);

	        
    		
	        Drawing tempDrawing = (Drawing) objStream.readObject();
	        //ArrayList<Figure> tempList = (ArrayList<Figure>) objStream.readObject();
    		//this = fff.myDrawing;
    		this.list.removeAll(list);
    		this.list.addAll(tempDrawing.list);
    		this.repaint();

			System.out.println("try me bihh");
            System.out.println("The Object has been read from the file");
                        
            objStream.close();

		}

	    catch (Exception e) {
	        e.getStackTrace();
	        System.out.println(e);
	        System.out.println("catch me outside howbouda");
	        
	    }
	}
	
	public void readFileWithBuffer() {
		try {
			File monFichier = new File("MonTexte.txt");
			FileReader fr = new FileReader(monFichier);
			BufferedReader br = new BufferedReader(fr);
			String ligne = null;
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close() ;
		}
		catch(Exception ex) {
			ex.printStackTrace() ;
		}

	}

}
