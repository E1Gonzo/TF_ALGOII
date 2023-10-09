package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ProductoEliminacion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblDescripcion;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JScrollPane scpDescripcion;
	private JTextArea txtAreaDescripcion;
	private JButton btnEliminar;
	private JPanel buttonPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProductoEliminacion dialog = new ProductoEliminacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProductoEliminacion() {
		setTitle("Eliminar Producto");
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
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(115, 96, 152, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		scpDescripcion = new JScrollPane();
		scpDescripcion.setBounds(115, 35, 152, 55);
		contentPanel.add(scpDescripcion);
		
		txtAreaDescripcion = new JTextArea();
		txtAreaDescripcion.setForeground(SystemColor.activeCaptionBorder);
		txtAreaDescripcion.setBackground(SystemColor.control);
		txtAreaDescripcion.setEditable(false);
		scpDescripcion.setViewportView(txtAreaDescripcion);
		txtAreaDescripcion.setLineWrap(true);
		{
			buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setActionCommand("Cancel");
				buttonPane.add(btnEliminar);
			}
		}
	}

}
