package Clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameGlobal extends JFrame {

	private JMenuBar barraMenu;
	private JMenu archivo;
	private JMenuItem empleado;
	private JMenuItem salir;
	private static JDesktopPane escritorio;
	private DialogoInicial dialogoInicial;
	
	private JPanel pnlFondo;
	
	
//	@SuppressWarnings("serial")
	public FrameGlobal() {
		//DIALOGO PARA INICIO DE EMPRESA
//		dialogoInicial = new DialogoInicial("Bienvenido");
//		dialogoInicial.setVisible(true);
		
		
		//INICIO DE FRAME PRINCIPAL
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 700);
		
//		setTitle(dialogoInicial.getTxtNombreEmpresa().getText());
		

		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		archivo = new JMenu("Archivo");
		empleado = new JMenuItem("Empleado");
		salir = new JMenuItem("Salir");

		escritorio = new JDesktopPane(){
		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        g.setColor(Color.BLACK);
		        g.fillRect(0, 0, getWidth(), getHeight());
		    }
		};
		
		setContentPane(escritorio);
		
		
		
		barraMenu.add(archivo);
		archivo.add(empleado);
		archivo.add(salir);

		empleado.addActionListener(new ListenerGlobal(this));
		salir.addActionListener(new ListenerGlobal(this));
		
		setLocationRelativeTo(null);
	}
	
	public static void Funcionalidad() {
		// TODO Auto-generated method stub
		Frame miFrame = new Frame();
		escritorio.add(miFrame);
		Dimension tamEscritorio = escritorio.getSize();
		Dimension tamFrame = miFrame.getSize();
		miFrame.setLocation((tamEscritorio.width - tamFrame.width)/2, (tamEscritorio.height - tamFrame.height)/2);

		miFrame.show();

	}

	public JMenuBar getBarraMenu() {
		return barraMenu;
	}

	public void setBarraMenu(JMenuBar barraMenu) {
		this.barraMenu = barraMenu;
	}

	public JMenu getArchivo() {
		return archivo;
	}

	public void setArchivo(JMenu archivo) {
		this.archivo = archivo;
	}

	public JMenuItem getEmpleado() {
		return empleado;
	}

	public void setEmpleado(JMenuItem empleado) {
		this.empleado = empleado;
	}

	public JMenuItem getSalir() {
		return salir;
	}

	public void setSalir(JMenuItem salir) {
		this.salir = salir;
	}
	
	public static JDesktopPane getEscritorio() {
		return escritorio;
	}

	

}
