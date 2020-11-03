import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Drawing<Figure> extends JPanel{
	Drawing(){
		super();
		c = Color.black;
		nameFigure = "Rectangle";
		list = new ArrayList<Figure>();
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		setBackground(Color.white);
		g.setColor(Color.red);
		g.fillRect(100, 100, 200, 40);
		
	}
	
	private ArrayList<Figure> list;
	private Color c;
	private String nameFigure;
	
	public void changeColor(Color cc){
		this.c = cc;
	}
	public void changeName(String nF){
		this.nameFigure = nF;
	}
	public void getRefList() {
		System.out.println(this.list.toString());
	}
}
