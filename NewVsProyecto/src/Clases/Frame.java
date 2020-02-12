package Clases;

import Clases.MyListener;
import ClaseDeDatos.Persona;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Frame extends JInternalFrame {

	private JPanel panelPrincipal;

	private List<Persona> lstPersona;

	private JPanel panelPrincipal1;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCerrar;
	private JPanel panelNorte;
	private JPanel panelSur;
	private JPanel panelSur1;
	private JPanel panelSur2;
	private JLabel lbtext1;
	private JLabel lblBusqueda;
	private JPanel panelAux;
	private String cabecera[];
	
	private JLabel lblImagen;
	private JPanel pnlImagen;
	private JTextField txtBusqueda;
	private JButton btnBuscar;

	public Frame() {
		super("Lista de empleados");
		lstPersona = new ArrayList<Persona>();

		setSize(600, 600);
		setLocation(200, 10);
		setResizable(true);
		setClosable(true);
		setIconifiable(true);

		// setClosable(true);

		panelPrincipal1 = new JPanel();
		panelPrincipal1.setLayout(new BorderLayout());
		setContentPane(panelPrincipal1);

		panelNorte = new JPanel();
		panelPrincipal1.add(panelNorte, BorderLayout.NORTH);

		lblBusqueda = new JLabel("Busqueda:");
		panelNorte.add(lblBusqueda);
			
		Image img= new ImageIcon("lupa.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(10, 10, Image.SCALE_SMOOTH));

		
		
		txtBusqueda = new JTextField();
		txtBusqueda.setColumns(10);
		panelNorte.add(txtBusqueda);		
		
		
		
		btnBuscar = new JButton();
		btnBuscar.setIcon(img2);
		btnBuscar.setSize(5, 10);
//		lblImagen = new JLabel();
//		lblImagen.setIcon(img2);
//		lblImagen.setPreferredSize(new Dimension(100,100));

//		lblImagen.setSize(1, 7);
		
		pnlImagen = new JPanel();
//		pnlImagen.add(lblImagen);
		pnlImagen.add(btnBuscar);
//		panelNorte.setBackground(Color.red);	
		panelNorte.add(pnlImagen);
		
		
		
		
		panelAux = new JPanel();

		String[] cabecera = {};
		String[][] datos = {};

		JScrollPane scrollPane = new JScrollPane();
		table = new JTable(datos, cabecera);
		scrollPane.setViewportView(table);

		panelAux.add(scrollPane);
		panelPrincipal1.add(panelAux, BorderLayout.CENTER);

		panelSur = new JPanel();
		panelSur.setLayout(new GridLayout(2, 1));
		panelPrincipal1.add(panelSur, BorderLayout.SOUTH);

		panelSur1 = new JPanel();
		panelSur.add(panelSur1);

		panelSur2 = new JPanel();
		panelSur.add(panelSur2);

		lbtext1 = new JLabel("Futuro paginado");
		panelSur1.add(lbtext1);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new MyListenerFrame(this));
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new MyListenerFrame(this));
		btnEliminar = new JButton("Eliminar");
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new MyListenerFrame(this));

		panelSur2.add(btnAgregar);
		panelSur2.add(btnModificar);
		panelSur2.add(btnEliminar);
		panelSur2.add(btnCerrar);
		repaint();
	}

	public void imprimirLista() {

		String[][] datos = new String[lstPersona.size()][5];

		for (int i = 0; i < lstPersona.size(); i++) {

			datos[i][0] = lstPersona.get(i).getNombre();
			datos[i][1] = lstPersona.get(i).getApellido();
			datos[i][2] = String.valueOf(lstPersona.get(i).getEdad());
			datos[i][3] = lstPersona.get(i).getDireccion();
			datos[i][4] = String.valueOf(lstPersona.get(i).isEstado());

		}

		cabecera = new String[] { "Nombre", "Apellido", "Edad", "Direccion", "Estado" };

		table.setModel(new javax.swing.table.DefaultTableModel(datos, cabecera));

//		cabecera.setFont(cabecera.getFont().deriveFont(Font.BOLD));

		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.RIGHT);
		table.getColumnModel().getColumn(2).setCellRenderer(tcr);

	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public JPanel getPanelPrincipal1() {
		return panelPrincipal1;
	}

	public JTable getTable() {
		return table;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnCerrar() {
		return btnCerrar;
	}

	public JPanel getPanelNorte() {
		return panelNorte;
	}

	public JPanel getPanelSur() {
		return panelSur;
	}

	public JPanel getPanelSur1() {
		return panelSur1;
	}

	public JPanel getPanelSur2() {
		return panelSur2;
	}

	public JLabel getLbtext1() {
		return lbtext1;
	}

	public JLabel getLbtext2() {
		return lbtext2;
	}

	public void addPersona(Persona p) {
		this.lstPersona.add(p);
	}

	public List<Persona> getLstPersona() {
		return lstPersona;
	}

	public void setLstPersona(List<Persona> lstPersona) {
		this.lstPersona = lstPersona;
	}

}
