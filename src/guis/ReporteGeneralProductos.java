package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ReporteGeneralProductos extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReporteGeneralProductos dialog = new ReporteGeneralProductos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ReporteGeneralProductos() {
		setTitle("Reportes");
		setBounds(100, 100, 774, 473);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSeleccion = new JLabel("Selecciona un reporte:");
			lblSeleccion.setBounds(26, 11, 184, 38);
			contentPanel.add(lblSeleccion);
		}
		
		JComboBox<String> cmbOpciones = new JComboBox<String>();
		cmbOpciones.setModel(new DefaultComboBoxModel(new String[] {"", "Reporte general por productos", "Reporte general por vendedores", "Reporte general por vendedor", "Reporte por producto", "Reporte por precios"}));
		cmbOpciones.setBounds(225, 19, 241, 22);
		contentPanel.add(cmbOpciones);
		
		JButton btnGenerarReporte = new JButton("Generar Reporte");
		btnGenerarReporte.setBounds(518, 19, 166, 22);
		contentPanel.add(btnGenerarReporte);
		
		JScrollPane scpResultado = new JScrollPane();
		scpResultado.setBounds(10, 59, 738, 365);
		contentPanel.add(scpResultado);
		
		JTextArea txtAreaResultado = new JTextArea();
		scpResultado.setViewportView(txtAreaResultado);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
