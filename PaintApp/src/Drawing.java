import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Drawing(){
		super();
		
		c = Color.black;
		this.nameFigure = "Rectangle";
		this.fileName = "Figures.xml";
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
	private String fileName;
	private int xc;
	private int yc;

	private int xr;
	private int yr;
	
	public void newDrawing() {
		this.list.removeAll(list);
		this.repaint();
	}
	public String getFileName() {
		return this.fileName;
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
	//	System.out.println(list.get(list.size()-1).saveString());
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

	        //output.writeInt(this);
	        output.writeObject(this);

			System.out.println("The image was saved to an unreadable file");
	        output.close();
	    }

	    catch (Exception e) {
	        e.getStackTrace();
	        System.out.println(e);
	    }
	}
	
	public void loadScreen() {
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

            System.out.println("The Object has been read from the unreadable file");
                        
            objStream.close();

		}

	    catch (Exception e) {
	        e.getStackTrace();
	        System.out.println(e);	        
	    }
	}
	
	public void saveBuffer() {
		
		    try {
	    		FileWriter myWriter = new FileWriter("MonTexte.txt");
		    	for( int i =0; i < list.size(); i++) {
		    		myWriter.write(list.get(i).saveString());
		    	}
	    		myWriter.close();
				System.out.println("The image was saved to a readable text file");
		    } catch (IOException e) {
		    	System.out.println("An error occurred.");
		    	e.printStackTrace();
		    }
		    
	}

	public void loadBuffer() {
		this.list.removeAll(list);
		try {
			File monFichier = new File("MonTexte.txt");
			FileReader fr = new FileReader(monFichier);
			BufferedReader br = new BufferedReader(fr);
			String ligne = null;
			while ((ligne = br.readLine()) != null) {
				//System.out.println(ligne);
				String[] resultat = ligne.split(" ");
				gimmeColor(resultat[0]);
				String[] oregon = resultat[2].split(",");
				this.xc = Integer.parseInt(oregon[0].substring(1));
				this.yc = Integer.parseInt(oregon[1].substring(0, oregon[1].length()-1));

				switch(resultat[1]) {
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

				resultat[3] = resultat[3].substring(0, resultat[3].length()-1);
				String[] theSize = resultat[3].split(",");
				if(theSize.length ==1) {
					this.xr = Integer.parseInt(theSize[0].substring(1));
					this.yr = Integer.parseInt(theSize[0].substring(1));
				} else {
					this.xr = Integer.parseInt(theSize[0].substring(1));
					this.yr = Integer.parseInt(theSize[1].substring(0, theSize[1].length()));	
				}
								
				this.list.get(list.size()-1).setBoundingBox(Math.abs(this.xr), Math.abs(this.yr));
				this.repaint();
				//this.xr = Integer.parseInt(theSize[0].substring(1));
				//this.yr = Integer.parseInt(theSize[1].substring(0, theSize[1].length()-1));

				
				
			}
			br.close() ;
			System.out.println("The image was loaded from a readable text file");
		}
		catch(Exception ex) {
			ex.printStackTrace() ;
		}
		this.repaint();
	}
	
		
	public void saveXML(String fileName) throws FileNotFoundException, IOException {
	    XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
	    try {
	    	encoder.writeObject(list);
	    	for (Figure f:list)
	    		{encoder.writeObject(f);
	    		encoder.writeObject(f.getOrigin());
	    		encoder.writeObject(f.getColor());
	    	}
	        encoder.flush();
			System.out.println("The image was saved to a XML file");
	    } finally {
	        encoder.close();
	    } 
	}


	@SuppressWarnings("unchecked")
	public void loadXML(String fileName) throws FileNotFoundException, IOException {

//		int l = 0;
//		int w = 0;

//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
//		ExceptionListener listener = null;
		XMLDecoder dec = new XMLDecoder(new FileInputStream(fileName));
		list = (ArrayList<Figure>) dec.readObject();
			
		for (Figure f:list) {
			f = (Figure) (dec.readObject());
			f.setOrigin((Point) (dec.readObject()));
			f.setColor((String) (dec.readObject()));
			f.draw(getGraphics());
		}
		this.repaint();
		System.out.println("The image was loaded from a XML file");
		dec.close();
	} 
	
	private void gimmeColor(String a) {
		switch(a) {
			case "Black": {
				this.changeColor(Color.black);
				break;
			}
			case "Red": {
				this.changeColor(Color.red);
				break;
			}
			case "Blue": {
				this.changeColor(Color.blue);
				break;
			}
			case "Green": {
				this.changeColor(Color.green);
				break;
			}
			case "Yellow": {
				this.changeColor(Color.yellow);
				break;
			}
			case "Pink": {
				this.changeColor(Color.pink);
				break;
			}
			case "Magenta": {
				this.changeColor(Color.magenta);
				break;
			}
			case "Orange": {
				this.changeColor(Color.orange);
				break;
			}
		}
	}
}
