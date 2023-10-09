package guis;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenu mnReportes;
	private JMenu mnProductos;
	private JMenuItem mntmIngreso_3;
	private JMenuItem mntmModificacion_3;
	private JMenuItem mntmConsulta_3;
	private JMenuItem mntmEliminacion_3;
	private JMenuItem mntmListado_3;
	private JMenu mnClientes;
	private JMenuItem mntmIngreso_2;
	private JMenuItem mntmModificacion_2;
	private JMenuItem mntmConsulta_2;
	private JMenuItem mntmEliminacion_2;
	private JMenuItem mntmListado_2;
	private JMenu mnVendedores;
	private JMenuItem mntmIngreso_1;
	private JMenuItem mntmModificacion_1;
	private JMenuItem mntmConsulta_1;
	private JMenuItem mntmEliminacion_1;
	private JMenuItem mntmListado_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("Men\u00FA Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 925, 550);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mnVendedores = new JMenu("Vendedores");
		mnMantenimiento.add(mnVendedores);
		
		mntmIngreso_1 = new JMenuItem("Ingreso");
		mnVendedores.add(mntmIngreso_1);
		
		mntmModificacion_1 = new JMenuItem("Modificaci\u00F3n");
		mnVendedores.add(mntmModificacion_1);
		
		mntmConsulta_1 = new JMenuItem("Consulta");
		mnVendedores.add(mntmConsulta_1);
		
		mntmEliminacion_1 = new JMenuItem("Eliminaci\u00F3n");
		mnVendedores.add(mntmEliminacion_1);
		
		mntmListado_1 = new JMenuItem("Listado");
		mnVendedores.add(mntmListado_1);
		
		mnClientes = new JMenu("Clientes");
		mnMantenimiento.add(mnClientes);
		
		mntmIngreso_2 = new JMenuItem("Ingreso");
		mnClientes.add(mntmIngreso_2);
		
		mntmModificacion_2 = new JMenuItem("Modificaci\u00F3n");
		mnClientes.add(mntmModificacion_2);
		
		mntmConsulta_2 = new JMenuItem("Consulta");
		mnClientes.add(mntmConsulta_2);
		
		mntmEliminacion_2 = new JMenuItem("Eliminaci\u00F3n");
		mnClientes.add(mntmEliminacion_2);
		
		mntmListado_2 = new JMenuItem("Listado");
		mnClientes.add(mntmListado_2);
		
		mnProductos = new JMenu("Productos");
		mnMantenimiento.add(mnProductos);
		
		mntmIngreso_3 = new JMenuItem("Ingreso");
		mnProductos.add(mntmIngreso_3);
		
		mntmModificacion_3 = new JMenuItem("Modificaci\u00F3n");
		mnProductos.add(mntmModificacion_3);
		
		mntmConsulta_3 = new JMenuItem("Consulta");
		mnProductos.add(mntmConsulta_3);
		
		mntmEliminacion_3 = new JMenuItem("Eliminaci\u00F3n");
		mnProductos.add(mntmEliminacion_3);
		
		mntmListado_3 = new JMenuItem("Listado");
		mnProductos.add(mntmListado_3);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Efectuar vender");
		mnVentas.add(mntmVender);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
