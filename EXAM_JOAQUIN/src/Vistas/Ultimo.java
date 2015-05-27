package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.IngresoLaby;
import Modelo.ModeloCadete;

public class Ultimo extends JPanel {
	private JTextField txtId;
	private JTextField inputComprobar;
	private JTextField apellidoUno;
	private ModeloCadete mc;
	private JButton btnComprobar;
	
	private Ventana ventana;
	private IngresoLaby iL;

	/**
	 * Create the panel.
	 */
	public Ultimo(Ventana v) {
		//SETEAMOS EL PANEL
		setBounds(100, 100, 450, 450);
		setLayout(null);
		this.ventana=v;
		
		//AÑADIMOS METODO QUE IMPLEMENTA EL ASPECTO GRAFICO
		etiquetasBotonesyDemas();
	
		
	}
	
	//CREAMOS METODO QUE SETEA TODO EL ASPECTO GRAFICO
	private void etiquetasBotonesyDemas(){
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(52, 42, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setBounds(52, 67, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		//txtId.setText(String.valueOf(mc.load().get(0).getId()));
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(183, 42, 74, 14);
		add(lblerApellido);
		
		apellidoUno = new JTextField();
		apellidoUno.setBounds(183, 67, 114, 20);
		add(apellidoUno);
		apellidoUno.setColumns(10);
		//apellidoUno.setText(mc.load().get(0).getApellidos());
		
		
		btnComprobar = new JButton("COMPROBAR");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		iL.getCod(, apellidoUno.getText());
			}
		});
		btnComprobar.setBounds(52, 124, 363, 23);
		add(btnComprobar);
		
		inputComprobar = new JTextField();
		inputComprobar.setBounds(52, 176, 363, 33);
		add(inputComprobar);
		inputComprobar.setColumns(10);
		
		
		JButton atras = new JButton("<< Atras");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMPLEMENTAMOS EL CARDLAYOUT PARA PODER CAMBIAR DE PANEL AL DARLE AL BOTON ATRAS

				CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
	    		layout.show(ventana.getContentPane(), "Secundario");

			}
		});
		atras.setBounds(31, 375, 89, 23);
		add(atras);
	}

}
