import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@SuppressWarnings("deprecation")
	Fenetre(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0,200);
		setSize(1000,500);
		
		Container contentPane = getContentPane();
		JMenuBar m = new JMenuBar();
		
		Drawing myDrawing = new Drawing();
		
		myDrawing.addMouseListener(myDrawing);
		myDrawing.addMouseMotionListener(myDrawing);
		contentPane.add(myDrawing,"Center");
		
		JMenu menu1 = new JMenu("Files");

		
		JMenuItem New = new JMenuItem("New");
		Listeners listenerNew = new Listeners(myDrawing);
		New.addActionListener(listenerNew);
		menu1.add(New);
		
		menu1.addSeparator();

		JMenuItem Save = new JMenuItem("Save");
		menu1.add(Save);
		Listeners listenerSave = new Listeners(myDrawing,this);
		Save.addActionListener(listenerSave);
		
		JMenuItem Load = new JMenuItem("Load");
		menu1.add(Load);
		Listeners listenerLoad = new Listeners(myDrawing,this);
		Load.addActionListener(listenerLoad);
		
		menu1.addSeparator();
		
		JMenuItem SaveB = new JMenuItem("SaveB");
		menu1.add(SaveB);
		Listeners listenerSaveB = new Listeners(myDrawing,this);
		SaveB.addActionListener(listenerSaveB);
		
		JMenuItem LoadB = new JMenuItem("LoadB");
		menu1.add(LoadB);
		Listeners listenerLoadB = new Listeners(myDrawing,this);
		LoadB.addActionListener(listenerLoadB);		
		
		menu1.addSeparator();
		
		JMenuItem SaveXML = new JMenuItem("SaveXML");
		menu1.add(SaveXML);
		Listeners listenerSaveXML = new Listeners(myDrawing,this);
		SaveXML.addActionListener(listenerSaveXML);
		
		JMenuItem LoadXML = new JMenuItem("LoadXML");
		menu1.add(LoadXML);
		Listeners listenerLoadXML = new Listeners(myDrawing,this);
		LoadXML.addActionListener(listenerLoadXML);
		
		
		menu1.addSeparator();
		
		JMenuItem Quit = new JMenuItem("Quit");
		menu1.add(Quit);
		Listeners listenerQuit = new Listeners(myDrawing);
		Quit.addActionListener(listenerQuit);
		
		New.setAccelerator(KeyStroke.getKeyStroke('Z', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		Save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		Load.setAccelerator(KeyStroke.getKeyStroke('W', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		SaveB.setAccelerator(KeyStroke.getKeyStroke('A', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		LoadB.setAccelerator(KeyStroke.getKeyStroke('Q', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		SaveXML.setAccelerator(KeyStroke.getKeyStroke('D', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
		LoadXML.setAccelerator(KeyStroke.getKeyStroke('E', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));

		m.add(menu1);
		
		
		
		JMenu menu2 = new JMenu("About");
		JMenuItem Authors = new JMenuItem("Authors");
		menu2.add(Authors);
		Listeners listenerAuthors = new Listeners(myDrawing,this);
		Authors.addActionListener(listenerAuthors);
		m.add(menu2);
		setJMenuBar(m);
		
		
		JPanel pan1 = new JPanel();
		JPanel ColorPanel = new JPanel();
		JPanel ToolPanel = new JPanel();
		
		pan1.setLayout(new GridLayout(1,2));

		ColorPanel.setLayout(new GridLayout(2,4));
		ToolPanel.setLayout(new GridLayout(2,2));

		
		JButton Noir = new JButton("Noir");
		Noir.setBackground(Color.black);
		Listeners listenerNo = new Listeners(myDrawing);
		Noir.addActionListener(listenerNo);
		ColorPanel.add(Noir);
		
		JButton Rouge = new JButton("Rouge");
		Rouge.setBackground(Color.red);
		Listeners listenerRo = new Listeners(myDrawing);
		Rouge.addActionListener(listenerRo);
		ColorPanel.add(Rouge);
		
		JButton Vert = new JButton("Vert");
		Vert.setBackground(Color.green);
		Listeners listenerVe = new Listeners(myDrawing);
		Vert.addActionListener(listenerVe);
		ColorPanel.add(Vert);
		
		JButton Bleu = new JButton("Bleu");
		Bleu.setBackground(Color.blue);
		Listeners listenerBl = new Listeners(myDrawing);
		Bleu.addActionListener(listenerBl);
		ColorPanel.add(Bleu);
		
		JButton Jaune = new JButton("Jaune");
		Jaune.setBackground(Color.yellow);
		Listeners listenerJa = new Listeners(myDrawing);
		Jaune.addActionListener(listenerJa);
		ColorPanel.add(Jaune);
		
		JButton Rose = new JButton("Rose");
		Rose.setBackground(Color.pink);
		Listeners listenerRos = new Listeners(myDrawing);
		Rose.addActionListener(listenerRos);
		ColorPanel.add(Rose);
		
		JButton Magenta = new JButton("Magenta");
		Magenta.setBackground(Color.magenta);
		Listeners listenerMa = new Listeners(myDrawing);
		Magenta.addActionListener(listenerMa);
		ColorPanel.add(Magenta);
		
		JButton Orange = new JButton("Orange");
		Orange.setBackground(Color.orange);
		Listeners listenerOr = new Listeners(myDrawing);
		Orange.addActionListener(listenerOr);
		ColorPanel.add(Orange);
		
		
		JButton Ellipse = new JButton("Ellipse");
		Listeners listener01 = new Listeners(myDrawing);
		Ellipse.addActionListener(listener01);
		ToolPanel.add(Ellipse);
		
		
		JButton Cercle = new JButton("Cercle");
		Listeners listener02 = new Listeners(myDrawing);
		Cercle.addActionListener(listener02);
		ToolPanel.add(Cercle);
		
		JButton Carre = new JButton("Carre");
		Listeners listener03 = new Listeners(myDrawing);
		Carre.addActionListener(listener03);
		ToolPanel.add(Carre);
		
		JButton Rectangle = new JButton("Rectangle");
		Listeners listener04 = new Listeners(myDrawing);
		Rectangle.addActionListener(listener04);
		ToolPanel.add(Rectangle);
		

		
//		pan1.add(new JButton("1"));
//		pan1.add(new JButton("2"));
		
		//JButton mybutton = new JButton("Sud");
		//mybutton.setBackground(Color.red);

//		contentPane.add(new JLabel("Ouest"),"West");
//		contentPane.add(new JCheckBox("Nord"),"North");
//		contentPane.add(new JTextArea("Centre"),"Center");
//		contentPane.add(new JTextField("Est"),"East");
	
		//JButton mybutton = new JButton("Bonjour");
		
		

		
		
		pan1.add(ColorPanel);
		pan1.add(ToolPanel);
		contentPane.add(pan1,"South");
		
		setVisible(true);
		
		
		
	}
	

}

