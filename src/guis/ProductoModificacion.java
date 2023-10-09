package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ProductoModificacion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JLabel lblCodigo;
	private JScrollPane scpDescripcion;
	private JTextArea txtAreaDescripcion;
	private JLabel lblDescripcion;
	private JLabel lblPrecio;
	private JButton btnBuscar;
	private JButton btnModificar;
	private JPanel buttonPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProductoModificacion dialog = new ProductoModificacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProductoModificacion() {
		setTitle("Modificar Productos");
		setBounds(100, 100, 323, 205);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCodigo.setBounds(33, 14, 46, 14);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(115, 11, 152, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDescripcion.setBounds(33, 39, 71, 14);
		contentPanel.add(lblDescripcion);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecio.setBounds(33, 98, 46, 14);
		contentPanel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(115, 96, 152, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		scpDescripcion = new JScrollPane();
		scpDescripcion.setBounds(115, 35, 152, 55);
		contentPanel.add(scpDescripcion);
		
		txtAreaDescripcion = new JTextArea();
		scpDescripcion.setViewportView(txtAreaDescripcion);
		txtAreaDescripcion.setLineWrap(true);
		{
			buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				btnModificar = new JButton("Modificar");
				btnModificar.setActionCommand("OK");
				buttonPane.add(btnModificar);
				getRootPane().setDefaultButton(btnModificar);
			}
			{
				btnBuscar = new JButton("Buscar");
				btnBuscar.setActionCommand("Cancel");
				buttonPane.add(btnBuscar);
			}
		}
	}

}
