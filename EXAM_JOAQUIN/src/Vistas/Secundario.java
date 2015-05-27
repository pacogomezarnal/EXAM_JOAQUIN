package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Secundario extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtApellido_1;
	private JTextField txtNacionalidad;

	/**
	 * Create the panel.
	 */
	public Secundario() {
		setBounds(100, 100, 450, 450);
		setLayout(null);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(36, 49, 46, 14);
		add(lblEquipo);
		
		JComboBox comboBoxEquipo = new JComboBox();
		comboBoxEquipo.setBounds(36, 74, 122, 20);
		add(comboBoxEquipo);
		
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
		
		JLabel lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(191, 196, 66, 14);
		add(lblApellido);
		
		txtApellido_1 = new JTextField();
		txtApellido_1.setEnabled(false);
		txtApellido_1.setEditable(false);
		txtApellido_1.setText("2\u00BA Apellido");
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
		
	}
}
