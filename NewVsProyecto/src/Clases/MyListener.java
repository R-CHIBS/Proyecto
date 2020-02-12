package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ClaseDeDatos.Persona;

public class MyListener implements ActionListener {

	private Dialog miDialog;
	private Frame miFrame;
	int contador;

	public MyListener(Dialog miDialog) {

		this.miDialog = miDialog;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == miDialog.getbtnGuardar()) {
			contador = 0;
			if (miDialog.getTxt1().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "El campo Nombre no esta ingresado");
			} else {
				// En este else puede entrar cualquier validacion respectiva....
				contador++;
			}
			if (miDialog.getTxt2().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "El campo Apellido no esta ingresado");
			} else {
				// En este else puede entrar cualquier validacion respectiva....
				contador++;
			}

			if (miDialog.getTxt3().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "El campo de Edad no esta ingresado");
				contador = contador--;
			} else {
				// En este else puede entrar cualquier validacion respectiva....
				contador++;
			}

			if (miDialog.getTxt4().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "El campo de Direccion no esta ingresado");
				contador = contador--;
			} else {
				// En este else puede entrar cualquier validacion respectiva....
				contador++;
			}

			if (contador == 4) {
				String nombre = miDialog.getTxt1().getText();
				String apellido = miDialog.getTxt2().getText();
//                  int edad = Integer.parseInt(miDialog.getTxt3().getText());

				// Validacion de la edad
				int edad = -1;
				int newEdad = validarEdad(edad);

				String direccion = miDialog.getTxt4().getText();
				Boolean estado = miDialog.getChek().isSelected();
				if (newEdad >= 1) {
					Persona p = new Persona(nombre, apellido, newEdad, direccion, estado);

					miDialog.getTxt1().setText("");
					miDialog.getTxt2().setText("");
					miDialog.getTxt3().setText("");
					miDialog.getTxt4().setText("");
					miDialog.getChek().setSelected(false);
					miDialog.getMiFrame().addPersona(p);
				}
			}
			miDialog.miFrame.imprimirLista();
			return;
		}
		

		if (arg0.getSource() == miDialog.getBtn2()) {
//			miDialog.miFrame.imprimirLista();
			miDialog.setVisible(false);
			miDialog.dispose();
		}

	}

	public int validarEdad(int edad) {
		try {
			edad = Integer.parseInt(miDialog.getTxt3().getText());
			if (edad < 0) {
				JOptionPane.showMessageDialog(null, "Introduzca... Edad >= 0!!...");
			}
			return edad;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Introduzca un valor correcto en Edad!!...");
			return -1;
		}
	}

}
