package test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
  
   
  
public class Test {
	
	protected String url;
	
	public Test(String url) {
		this.url = url;
		JFrame fen = new JFrame ("Image");
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		fen.setPreferredSize(new Dimension(width/2, (height-40)/2));
		
	    //pan.setBackground(Color.BLUE);
	    //fen.add(pan);
	    
	    ImagePane img = new ImagePane(this.url);
	    img.setPreferredSize(new Dimension(5000, 5000));
	    
	    
	    ScrollPane scrol = new ScrollPane();
	    scrol.add(img);
	    fen.setContentPane(scrol);
	    
	    
	    
//	    JTextField tape = new JTextField ();
//	  
//	    Font police = new Font ("Arial", Font.BOLD, 25);
//	    pan.add(tape);
//	    
//	    tape.setBounds(60,450,560,50);
//	    tape.setFont(police); 
	  
	    
	    //fen.setSize(850,600);
	    fen.pack();
	    fen.setLocationRelativeTo(null);
	    fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fen.setVisible(true);
	}
	
//	public static void main(String[] args) {
//		
//		Test test = new Test("url");
//	}
}