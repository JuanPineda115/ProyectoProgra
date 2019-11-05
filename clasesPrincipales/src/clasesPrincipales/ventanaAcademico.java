package clasesPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;

public class ventanaAcademico {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAcademico window = new ventanaAcademico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaAcademico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Anterior");
		button.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button.setBounds(78, 564, 117, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Nuevo");
		button_1.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button_1.setBounds(199, 564, 117, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Siguiente");
		button_2.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button_2.setBounds(315, 564, 117, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Borrar");
		button_3.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button_3.setBounds(486, 498, 75, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Base de datos");
		button_4.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button_4.setBounds(425, 142, 136, 29);
		frame.getContentPane().add(button_4);
		
		JButton btnEstudiante = new JButton("Estudiante");
		btnEstudiante.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnEstudiante.setBounds(425, 101, 136, 29);
		frame.getContentPane().add(btnEstudiante);
		
		JButton button_6 = new JButton("Menú principal");
		button_6.setFont(new Font("Helvetica", Font.PLAIN, 13));
		button_6.setBounds(425, 58, 136, 26);
		frame.getContentPane().add(button_6);
		
		JLabel lblAcadmico = DefaultComponentFactory.getInstance().createTitle("Académico");
		lblAcadmico.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblAcadmico.setBounds(194, 16, 136, 29);
		frame.getContentPane().add(lblAcadmico);
		
		JLabel lblClase = DefaultComponentFactory.getInstance().createLabel("Clase:");
		lblClase.setFont(new Font("Skia", Font.PLAIN, 18));
		lblClase.setBounds(20, 74, 46, 18);
		frame.getContentPane().add(lblClase);
		
		JLabel lblNota = DefaultComponentFactory.getInstance().createLabel("Nota:");
		lblNota.setFont(new Font("Skia", Font.PLAIN, 18));
		lblNota.setBounds(125, 112, 46, 18);
		frame.getContentPane().add(lblNota);
		
		textField = new JTextField();
		textField.setBounds(78, 70, 288, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 104, 183, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 166, 288, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(78, 258, 288, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(78, 361, 288, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(78, 445, 288, 29);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(183, 196, 183, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(183, 291, 183, 26);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(183, 391, 183, 26);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(183, 477, 183, 26);
		frame.getContentPane().add(textField_9);
		
		JLabel lblNota_1 = DefaultComponentFactory.getInstance().createLabel("Nota:");
		lblNota_1.setFont(new Font("Skia", Font.PLAIN, 18));
		lblNota_1.setBounds(125, 204, 46, 18);
		frame.getContentPane().add(lblNota_1);
		
		JLabel lblNota_2 = DefaultComponentFactory.getInstance().createLabel("Nota:");
		lblNota_2.setFont(new Font("Skia", Font.PLAIN, 18));
		lblNota_2.setBounds(125, 295, 46, 18);
		frame.getContentPane().add(lblNota_2);
		
		JLabel lblNota_3 = DefaultComponentFactory.getInstance().createLabel("Nota:");
		lblNota_3.setFont(new Font("Skia", Font.PLAIN, 18));
		lblNota_3.setBounds(125, 481, 46, 18);
		frame.getContentPane().add(lblNota_3);
		
		JLabel lblNota_4 = DefaultComponentFactory.getInstance().createLabel("Nota:");
		lblNota_4.setFont(new Font("Skia", Font.PLAIN, 18));
		lblNota_4.setBounds(125, 395, 46, 18);
		frame.getContentPane().add(lblNota_4);
		
		JLabel lblClase_1 = DefaultComponentFactory.getInstance().createLabel("Clase:");
		lblClase_1.setFont(new Font("Skia", Font.PLAIN, 18));
		lblClase_1.setBounds(20, 171, 46, 18);
		frame.getContentPane().add(lblClase_1);
		
		JLabel lblClase_2 = DefaultComponentFactory.getInstance().createLabel("Clase:");
		lblClase_2.setFont(new Font("Skia", Font.PLAIN, 18));
		lblClase_2.setBounds(20, 263, 46, 18);
		frame.getContentPane().add(lblClase_2);
		
		JLabel lblClase_3 = DefaultComponentFactory.getInstance().createLabel("Clase:");
		lblClase_3.setFont(new Font("Skia", Font.PLAIN, 18));
		lblClase_3.setBounds(20, 366, 46, 18);
		frame.getContentPane().add(lblClase_3);
		
		JLabel lblClase_4 = DefaultComponentFactory.getInstance().createLabel("Clase:");
		lblClase_4.setFont(new Font("Skia", Font.PLAIN, 18));
		lblClase_4.setBounds(20, 450, 46, 18);
		frame.getContentPane().add(lblClase_4);
	}
}
