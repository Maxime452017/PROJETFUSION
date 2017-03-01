package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import morpion.GrilleAffiche;

public class Entree {
	
	public Entree() {
		
		JFrame fenetre = new JFrame ("Fusion Image");
		fenetre.setPreferredSize(new Dimension(700, 300));
		
	    JPanel panel1 = new JPanel();
	    JLabel label1 = new JLabel("Ecrire l'URL de l'image 1 :");
	    panel1.add(label1);
	    JTextField image1 = new JTextField(35);
	    panel1.add(image1);
	    fenetre.add(panel1);
	    fenetre.add(panel1, BorderLayout.NORTH);
	    
	    JPanel panel2 = new JPanel();
	    JLabel label2 = new JLabel("Ecrire l'URL de l'image 2 :");
	    panel2.add(label2);
	    JTextField image2 = new JTextField(35);
	    panel2.add(image2);
	    fenetre.add(panel2);
	    fenetre.add(panel2, BorderLayout.CENTER);
	    
	    JPanel panel3 = new JPanel();
	    JButton ouvrir = new JButton("ouvrir");
	    panel3.add(ouvrir);
	    ouvrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Test imageAffiche1 = new Test(image1.getText());
				System.out.println(image1.getText());
				//Test imageAffiche2 = new Test(image2.getText());
			}
		});
	    fenetre.add(panel3, BorderLayout.SOUTH);
	    
	    
	    
//	    JTextField tape = new JTextField ();
//	  
//	    Font police = new Font ("Arial", Font.BOLD, 25);
//	    pan.add(tape);
//	    
//	    tape.setBounds(60,450,560,50);
//	    tape.setFont(police); 
	  
	    
	    //fen.setSize(850,600);
	    fenetre.pack();
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		Entree entree = new Entree();
	}

}
