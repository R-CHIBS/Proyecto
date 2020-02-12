package Clases;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class DialogoInicial extends JDialog {
	private JLabel nombreEmpresa;
	private JPanel pnlDialogoCentral;
	private JPanel pnlDialogoSur;
	private JPanel pnlDialogoLblNombre;
	private JPanel pnlDialogotxtNombre;
	private JPanel pnlDialogoBtnContinuar;
	private JTextField txtNombreEmpresa;
	private JButton btnDialogoContinuar;
	
	private String nomEmpresa;
	
	
	public DialogoInicial(String name) {
		setTitle("Bienvenido");
		pnlDialogoCentral      = new JPanel();
		pnlDialogoSur          = new JPanel();
		pnlDialogoLblNombre    = new JPanel();
		pnlDialogotxtNombre    = new JPanel();
		pnlDialogoBtnContinuar = new JPanel();
		nombreEmpresa          = new JLabel("Nombre para empresa");
		txtNombreEmpresa       = new JTextField();

		txtNombreEmpresa.addKeyListener(new KeyAdapter(){ 
			public void keyReleased (KeyEvent e) {
				btnDialogoContinuar.setEnabled(txtNombreEmpresa.getText().length() != 0 );
				
			}
		});
		txtNombreEmpresa.addKeyListener(new KeyListener(this));
		txtNombreEmpresa.setColumns(10);
		
		
		btnDialogoContinuar = new JButton("CONTINUAR");
		btnDialogoContinuar.setEnabled(false);
		btnDialogoContinuar.addActionListener(new ListenerDialogo(this));
		
//		setVisible(true);
		
		setLayout(new BorderLayout());
		
		add(pnlDialogoCentral, BorderLayout.CENTER);
		add(pnlDialogoSur,BorderLayout.SOUTH);
		
		pnlDialogoCentral.setLayout(new GridLayout(2,0));
		pnlDialogoCentral.add(pnlDialogoLblNombre); 
		pnlDialogoLblNombre.add(nombreEmpresa);
		
		pnlDialogoCentral.add(pnlDialogotxtNombre);
		pnlDialogotxtNombre.add(txtNombreEmpresa);
		
		pnlDialogoSur.add(pnlDialogoBtnContinuar);
		pnlDialogoBtnContinuar.add(btnDialogoContinuar);
		
		
		
		pack();
		setLocationRelativeTo(null);
	}

	public JLabel getNombreEmpresa() {
		return nombreEmpresa;
	}

	public JPanel getPnlDialogoCentral() {
		return pnlDialogoCentral;
	}

	public JPanel getPnlDialogoSur() {
		return pnlDialogoSur;
	}

	public JPanel getPnlDialogoLblNombre() {
		return pnlDialogoLblNombre;
	}

	public JPanel getPnlDialogotxtNombre() {
		return pnlDialogotxtNombre;
	}

	public JPanel getPnlDialogoBtnContinuar() {
		return pnlDialogoBtnContinuar;
	}

	public JTextField getTxtNombreEmpresa() {
		return txtNombreEmpresa;
	}

	public JButton getBtnDialogoContinuar() {
		return btnDialogoContinuar;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}
	
	public void setNomEmpresa(String nom) {
		this.nomEmpresa = nom;
	}
}
