package Main;

import Clases.Dialog;
import Clases.DialogoInicial;
import Clases.FrameGlobal;
import Clases.Frame;

public class MiPrincipal {

	public static void main(String[] args) {
		// Frame f = new Frame();
		// f.setVisible(true);
		DialogoInicial d = new DialogoInicial("Bienvenido");
		d.setVisible(true);
		FrameGlobal f = new FrameGlobal();
//		f.setVisible(true);
	}
}
