package Clases;

import Clases.Frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dialog extends JDialog {

	Frame miFrame;

	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;

	private JLabel etq1;
	private JLabel etq2;
	private JLabel etq3;
	private JLabel etq4;
	private JLabel etq5;

	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JCheckBox chek;

	private JButton btnGuardar;
	private JButton btn2;

	public Dialog(Frame miFrame, int numero) {

		this.miFrame = miFrame;
		setSize(400, 500);
		setLocation(1115,150);
		if (numero == 1) {
			componentesCrearEmpleado();

		}
		if (numero == 2) {
			componentesEditarEmpleado();
		}

	}

	private void componentesCrearEmpleado() {
		// TODO Auto-generated method stub
		componentes();
		chek = new JCheckBox();
		panel6.add(etq5);
		panel6.add(chek);

	}
	
	private void componentesEditarEmpleado() {
		componentes();

	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}

	public void setPanel3(JPanel panel3) {
		this.panel3 = panel3;
	}

	public void setPanel4(JPanel panel4) {
		this.panel4 = panel4;
	}

	public void setPanel5(JPanel panel5) {
		this.panel5 = panel5;
	}

	public void setPanel6(JPanel panel6) {
		this.panel6 = panel6;
	}

	public void setPanel7(JPanel panel7) {
		this.panel7 = panel7;
	}

	public void setEtq1(JLabel etq1) {
		this.etq1 = etq1;
	}

	public void setEtq2(JLabel etq2) {
		this.etq2 = etq2;
	}

	public void setEtq3(JLabel etq3) {
		this.etq3 = etq3;
	}

	public void setEtq4(JLabel etq4) {
		this.etq4 = etq4;
	}

	public void setEtq5(JLabel etq5) {
		this.etq5 = etq5;
	}

	public void setTxt1(JTextField txt1) {
		this.txt1 = txt1;
	}

	public void setTxt2(JTextField txt2) {
		this.txt2 = txt2;
	}

	public void setTxt3(JTextField txt3) {
		this.txt3 = txt3;
	}

	public void setTxt4(JTextField txt4) {
		this.txt4 = txt4;
	}

	public void setChek(JCheckBox chek) {
		this.chek = chek;
	}

	public void setbtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public JPanel getPanel3() {
		return panel3;
	}

	public JPanel getPanel4() {
		return panel4;
	}

	public JPanel getPanel5() {
		return panel5;
	}

	public JPanel getPanel6() {
		return panel6;
	}

	public JPanel getPanel7() {
		return panel7;
	}

	public JLabel getEtq1() {
		return etq1;
	}

	public JLabel getEtq2() {
		return etq2;
	}

	public JLabel getEtq3() {
		return etq3;
	}

	public JLabel getEtq4() {
		return etq4;
	}

	public JLabel getEtq5() {
		return etq5;
	}

	public JTextField getTxt1() {
		return txt1;
	}

	public JTextField getTxt2() {
		return txt2;
	}

	public JTextField getTxt3() {
		return txt3;
	}

	public JTextField getTxt4() {
		return txt4;
	}

	public JCheckBox getChek() {
		return chek;
	}

	public JButton getbtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public Frame getMiFrame() {
		return miFrame;
	}

	public void setMiFrame(Frame miFrame) {
		this.miFrame = miFrame;
	}

	private void componentes() {
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 1));
//		setLocationRelativeTo(null);

		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();

		etq1 = new JLabel("Nombre");
		etq2 = new JLabel("Apellido");
		etq3 = new JLabel("Edad");
		etq4 = new JLabel("Direccion");
		etq5 = new JLabel("Estado");

		txt1 = new JTextField();
		txt1.setColumns(10);
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt4 = new JTextField();
		txt4.setColumns(10);

//                chek = new JCheckBox();

		btnGuardar = new JButton("Guardar");
		btn2 = new JButton("Cancelar");

		panel1.add(panel2);
		panel1.add(panel3);
		panel1.add(panel4);
		panel1.add(panel5);
		panel1.add(panel6);

		panel7.add(btnGuardar);
		panel7.add(btn2);

		panel2.add(etq1);
		panel2.add(txt1);

		panel3.add(etq2);
		panel3.add(txt2);

		panel4.add(etq3);
		panel4.add(txt3);

		panel5.add(etq4);
		panel5.add(txt4);

//                panel6.add(etq5);
//                panel6.add(chek);

		btnGuardar.addActionListener(new MyListener(this));
		btn2.addActionListener(new MyListener(this));

		getContentPane().add(panel7, BorderLayout.SOUTH);
		getContentPane().add(panel1, BorderLayout.CENTER);
	}

}
