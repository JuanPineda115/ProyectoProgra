package clasesPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class ventanaEstudiante {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaEstudiante window = new ventanaEstudiante();
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
	public ventanaEstudiante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstudiante = DefaultComponentFactory.getInstance().createTitle("Estudiante");
		lblEstudiante.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblEstudiante.setBounds(228, 16, 130, 25);
		frame.getContentPane().add(lblEstudiante);
		
		JLabel lblNombreYApellido = DefaultComponentFactory.getInstance().createLabel("Nombre y apellido:");
		lblNombreYApellido.setFont(new Font("Skia", Font.PLAIN, 16));
		lblNombreYApellido.setBounds(22, 67, 136, 17);
		frame.getContentPane().add(lblNombreYApellido);
		
		JLabel lblEdad = DefaultComponentFactory.getInstance().createLabel("Edad:");
		lblEdad.setFont(new Font("Skia", Font.PLAIN, 16));
		lblEdad.setBounds(22, 111, 122, 16);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblPesolb = DefaultComponentFactory.getInstance().createLabel("Peso (lb):");
		lblPesolb.setFont(new Font("Skia", Font.PLAIN, 16));
		lblPesolb.setBounds(22, 163, 122, 16);
		frame.getContentPane().add(lblPesolb);
		
		JLabel lblAlimentosQueConsume = DefaultComponentFactory.getInstance().createLabel("Alimentos que consume:");
		lblAlimentosQueConsume.setFont(new Font("Skia", Font.PLAIN, 16));
		lblAlimentosQueConsume.setBounds(22, 216, 174, 17);
		frame.getContentPane().add(lblAlimentosQueConsume);
		
		textField = new JTextField();
		textField.setBounds(201, 64, 216, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 108, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 160, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 213, 216, 80);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnMenPrincipal = new JButton("Menú principal");
		btnMenPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnMenPrincipal.setBounds(456, 47, 136, 26);
		frame.getContentPane().add(btnMenPrincipal);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnSiguiente.setBounds(335, 330, 117, 29);
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnAnterior.setBounds(98, 330, 117, 29);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnNuevo.setBounds(219, 330, 117, 29);
		frame.getContentPane().add(btnNuevo);
		
		JButton btnAcadmico = new JButton("Académico");
		btnAcadmico.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnAcadmico.setBounds(456, 90, 136, 29);
		frame.getContentPane().add(btnAcadmico);
		
		JButton btnBaseDeDatos = new JButton("Base de datos");
		btnBaseDeDatos.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnBaseDeDatos.setBounds(456, 131, 136, 29);
		frame.getContentPane().add(btnBaseDeDatos);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnBorrar.setBounds(504, 272, 75, 29);
		frame.getContentPane().add(btnBorrar);
	}
}
