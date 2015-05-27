package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Ventana extends JFrame {

	private Principal principal;
	private Secundario secundario;
	private Ultimo ultimo;


	public Ventana() {
		setTitle("The Laby");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		getContentPane().setLayout(new CardLayout(0, 0));
	
		//Declaramos los paneles
		
		principal=new Principal(this);
		secundario=new Secundario();
		ultimo=new Ultimo();
		
		//A�adimos los paneles
		
		this.getContentPane().add("Principal", principal);
		this.getContentPane().add("Secundario", secundario);
		this.getContentPane().add("Ultimo", ultimo);

	}

}
