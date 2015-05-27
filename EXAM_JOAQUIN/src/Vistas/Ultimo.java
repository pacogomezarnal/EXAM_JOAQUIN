package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ultimo extends JPanel {
	private JTextField txtId;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Ultimo() {
		setBounds(100, 100, 450, 450);
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(52, 42, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setBounds(52, 67, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(183, 42, 74, 14);
		add(lblerApellido);
		
		textField = new JTextField();
		textField.setBounds(183, 67, 114, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(52, 124, 363, 23);
		add(btnComprobar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(52, 176, 363, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("<< Atr\u00E1s");
		button.setBounds(30, 392, 89, 23);
		add(button);
		
	}

}
