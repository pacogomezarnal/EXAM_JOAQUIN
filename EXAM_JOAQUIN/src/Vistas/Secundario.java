package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Cadete;
import Modelo.ModeloCadete;

public class Secundario extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtApellido_1;
	private JTextField txtNacionalidad;
	private JTextField txtId;
	private Ventana ventana;
	private ModeloCadete mc;
	private JComboBox comboBoxEquipo;
	
	private Cadete cadeteSeleccionado;
	/**
	 * Create the panel.
	 */
	public Secundario(Ventana v) {
		setBounds(100, 100, 450, 450);
		setLayout(null);
		this.ventana=v;
		
		//AÑADIMOS LOS METODOS NECESARIOS PARA IMPLEMENTAR TODO EL ASPECTO GRAFICO DE LA VENTANA
		etiquetasBotonesyDemas();
		comboBox();
		//volcadoDatos();
		//cargarcomboBoxEquipo();
		
		
	}

	//CREAMOS METODO PARA IMPLEMENTAR EL ASPECTO GRAFICO DE MANERA MAS ORDENADA

	public void etiquetasBotonesyDemas(){
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(36, 49, 46, 14);
		add(lblEquipo);
		
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(197, 49, 46, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(191, 74, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(191, 125, 77, 14);
		add(lblerApellido);
		
		txtApellido = new JTextField();
		txtApellido.setEnabled(false);
		txtApellido.setEditable(false);
		txtApellido.setText("1er Apellido");
		txtApellido.setBounds(191, 150, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblApellido = new JLabel("2ºApellido");
		lblApellido.setBounds(191, 196, 66, 14);
		add(lblApellido);
		
		txtApellido_1 = new JTextField();
		txtApellido_1.setEnabled(false);
		txtApellido_1.setEditable(false);
		txtApellido_1.setText("2º Apellido");
		txtApellido_1.setBounds(191, 221, 86, 20);
		add(txtApellido_1);
		txtApellido_1.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(191, 272, 77, 14);
		add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setText("Nacionalidad");
		txtNacionalidad.setEnabled(false);
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setBounds(191, 297, 86, 20);
		add(txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(339, 49, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("Id");
		txtId.setBounds(339, 74, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JButton btnAtrs = new JButton("<< Atras");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//IMPLEMENTAMOS EL CARDLAYOUT PARA PODER CAMBIAR DE PANEL AL DARLE AL BOTON ATRAS
				CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
	    		layout.show(ventana.getContentPane(), "Principal");
			}
		});
		btnAtrs.setBounds(31, 380, 93, 23);
		add(btnAtrs);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IMPLEMENTAMOS EL CARDLAYOUT PARA PODER CAMBIAR DE PANEL AL DARLE AL BOTON SIGUIENTE

				CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
	    		layout.show(ventana.getContentPane(), "Ultimo");
			}
		});
		btnSiguiente.setBounds(319, 380, 106, 23);
		add(btnSiguiente);
	}
	
	private void comboBox(){
		comboBoxEquipo = new JComboBox();
		comboBoxEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBoxEquipo.setBounds(10, 71, 135, 27);
		add(comboBoxEquipo);
	}
	
	//ESTO ME HA JODIDO EL EXAMEN ENTERO ME CAGO EN LOS NULLPOINTEREXCEPTION PACO. LO INTENTÉ DE MIL MANERAS.
	//HABÍA PRACTICADO MODELOS ANTES DEL EXAMEN Y LO TENIA TAL CUAL. PUES ME SACABA NULLPOINTER DEL LOAD DEL MODELO
	//Y ME HA JODIDO LA VIDA
	
	
	
	/*public void cargarcomboBoxEquipo(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        comboBoxEquipo.setModel(modelo);
        ArrayList<Cadete> usuarios = new ArrayList<Cadete>();
        usuarios=mc.load();
        for(int i=0;i<usuarios.size();i++){
            Cadete cadete=(Cadete)usuarios.get(i);
            modelo.addElement(cadete);
        }
    }*/

	 /*private void volcadoDatos(){
		    txtNombre.setText(mc.load().get(0).getNombre());
		    txtApellido.setText(mc.load().get(0).getApellidos());
		    txtApellido_1.setText(String.valueOf(mc.load().get(0).getEdad()));
		    txtNacionalidad.setText(mc.load().get(0).getNacionalidad());
		    txtId.setText(String.valueOf(mc.load().get(0).getId()));
		  
	 } */
}