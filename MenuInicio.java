package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class MenuInicio extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public MenuInicio() {
		setForeground(new Color(0, 100, 0));
		setBorder(new TitledBorder(UIManager.getBorder("EditorPane.border"), "Inicio", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		setLayout(new GridLayout(5, 2, 5, 0));
		
		JLabel lblActividadesDeHoy = new JLabel("Actividades de hoy:");
		add(lblActividadesDeHoy);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTareas = new JLabel("Tareas:");
		add(lblTareas);
		
		textField_1 = new JTextField();
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_5 = new JTextField();
		add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblRecordatorios = new JLabel("Recordatorios");
		add(lblRecordatorios);
		
		textField_2 = new JTextField();
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_7 = new JTextField();
		add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		add(textField_8);
		textField_8.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		add(separator_2);
		
		JSeparator separator_5 = new JSeparator();
		add(separator_5);
		
		JSeparator separator_8 = new JSeparator();
		add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		add(separator_9);
		
		JButton btnNewButton = new JButton("Salud");
		add(btnNewButton);
		
		JButton btnNotas = new JButton("Calendario");
		add(btnNotas);
		
		JButton btnNewButton_1 = new JButton("Clases");
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Comunidad");
		add(btnNewButton_2);

	}

}
