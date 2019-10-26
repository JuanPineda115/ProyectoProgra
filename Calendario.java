package interfaz;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;

public class Calendario extends JPanel {
	/**
	 * @wbp.nonvisual location=180,481
	 */
	private final JTextField textField = new JTextField();
	public Comunidad() {
		setBorder(new EmptyBorder(5, 0, 0, 0));
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblCalendario = DefaultComponentFactory.getInstance().createTitle("Calendario");
		lblCalendario.setVerticalAlignment(SwingConstants.TOP);
		lblCalendario.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCalendario);
	}

	/**
	 * Create the panel.
	 */
	public Calendario() {
		textField.setColumns(10);
		
		JLabel lblCalendario_1 = DefaultComponentFactory.getInstance().createTitle("- Calendario -");
		add(lblCalendario_1);
		
		JCalendar calendar = new JCalendar();
		add(calendar);
		
		JButton btnInicio = new JButton("Inicio");
		add(btnInicio);
		
		JButton btnSalir = new JButton("Salir");
		add(btnSalir);

	}

}
