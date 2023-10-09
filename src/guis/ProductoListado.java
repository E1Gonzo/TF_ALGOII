package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProductoListado extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnListar;
	private JScrollPane scpResultados;
	private JTextArea txtAreaResultados;
	private JPanel buttonPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProductoListado dialog = new ProductoListado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProductoListado() {
		setTitle("Listar Productos");
		setBounds(100, 100, 366, 456);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scpResultados = new JScrollPane();
		scpResultados.setBounds(10, 11, 330, 362);
		contentPanel.add(scpResultados);
		
		txtAreaResultados = new JTextArea();
		scpResultados.setViewportView(txtAreaResultados);
		{
			buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				btnListar = new JButton("Listar");
				btnListar.setActionCommand("Cancel");
				buttonPane.add(btnListar);
			}
		}
	}

}
