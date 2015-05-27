package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Modelo.ModeloCadete;

public class Principal extends JPanel {
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField edadField;
	private JTextField nacionalidadField;
	private JTextField IdField;
	private Ventana ventana;
	
	ModeloCadete mc;

	/**
	 * Create the panel.
	 */
	public Principal(Ventana v) {
		//SETEAMOS EL PANEL 
		setBounds(100, 100, 450, 450);
		setLayout(null);
		this.ventana= v;
		mc=new ModeloCadete();

		//AÑADIMOS LOS METODOS NECESARIOS PARA IMPLEMENTAR TODO EL ASPECTO GRAFICO DE LA VENTANA
		etiquetas();
		botones();
		camposTexto();
		
		//AÑADIMOS EL METODO QUE VUELCA LOS DATOS EN LOS CAMPOS DE TEXTO
		volcadoDatos();
		
		
	}
	 //CREAMOS METODOS PARA IMPLEMENTAR EL ASPECTO GRAFICO DE MANERA MAS ORDENADA
	public void etiquetas(){
		    
		 JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\dai\\Desktop\\usuario.png"));
			label.setBounds(10, 11, 202, 193);
			add(label);
			
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(252, 11, 46, 14);
			add(lblNombre);
			
			JLabel lblApellidos = new JLabel("Apellidos");
			lblApellidos.setBounds(252, 67, 86, 14);
			add(lblApellidos);
			
			JLabel lblEdad = new JLabel("Edad");
			lblEdad.setBounds(252, 123, 86, 14);
			add(lblEdad);
			
			JLabel lblNacionalidad = new JLabel("Nacionalidad");
			lblNacionalidad.setBounds(252, 179, 71, 14);
			add(lblNacionalidad);
			
			JLabel lblId = new JLabel("Id");
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setBounds(375, 11, 46, 14);
			add(lblId);
	 }
	 
	 public void camposTexto(){
		 
		 nombreField = new JTextField();
			nombreField.setText("Nombre");
			nombreField.setEditable(false);
			nombreField.setBounds(252, 36, 86, 20);
			add(nombreField);
			nombreField.setColumns(10);
			
			
			
			apellidoField = new JTextField();
			apellidoField.setText("Apellidos");
			apellidoField.setEditable(false);
			apellidoField.setBounds(252, 92, 151, 20);
			add(apellidoField);
			apellidoField.setColumns(10);
			
			
			
			edadField = new JTextField();
			edadField.setText("Edad");
			edadField.setEditable(false);
			edadField.setBounds(252, 148, 86, 20);
			add(edadField);
			edadField.setColumns(10);
			
			
			
			nacionalidadField = new JTextField();
			nacionalidadField.setText("Nacionalidad");
			nacionalidadField.setEditable(false);
			nacionalidadField.setBounds(252, 204, 86, 20);
			add(nacionalidadField);
			nacionalidadField.setColumns(10);
			
			
			
			IdField = new JTextField();
			IdField.setText("Id");
			IdField.setEditable(false);
			IdField.setColumns(10);
			IdField.setBounds(354, 36, 86, 20);
			add(IdField);
	 }
	 
	 public void botones(){
		    JButton btnSiguiente = new JButton("Siguiente >>");
		    btnSiguiente.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
					//IMPLEMENTAMOS EL CARDLAYOUT PARA PODER CAMBIAR DE PANEL AL DARLE AL BOTON SIGUIENTE

		    		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		    		layout.show(ventana.getContentPane(), "Secundario");
		    	}
		    });
			btnSiguiente.setBounds(318, 357, 122, 23);
			add(btnSiguiente); 
	 }
	 
	 //CREAMOS EL METODO PARA VOLCAR LOS DATOS EN LOS CAMPOS DE TEXTO. 
	 private void volcadoDatos(){
		    nombreField.setText(mc.load().get(0).getNombre());
		    apellidoField.setText(mc.load().get(0).getApellidos());
		    edadField.setText(String.valueOf(mc.load().get(0).getEdad()));
		    nacionalidadField.setText(mc.load().get(0).getNacionalidad());
		    IdField.setText(String.valueOf(mc.load().get(0).getId()));
		  
		}
}
