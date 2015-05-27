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
		//Seteamos el JFrame
		setTitle("The Laby");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		getContentPane().setLayout(new CardLayout(0, 0));
	
		//Declaramos los paneles que contendrá
		
		principal=new Principal(this);
		secundario=new Secundario(this);
		ultimo=new Ultimo(this);
		
		//Añadimos los paneles
		
		this.getContentPane().add("Principal", principal);
		this.getContentPane().add("Secundario", secundario);
		this.getContentPane().add("Ultimo", ultimo);

	}

}
