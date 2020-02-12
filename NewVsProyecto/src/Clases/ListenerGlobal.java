package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

public class ListenerGlobal implements ActionListener {
	
private JInternalFrame intFrame;	
private FrameGlobal miFrameGlobal;

    
    public ListenerGlobal(FrameGlobal miFrameGlobal){
        this.miFrameGlobal = miFrameGlobal;
    }
   
	
    @Override
  public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()  == miFrameGlobal.getEmpleado()){
        	
            Frame miFrame = new Frame();
        	miFrame.setVisible(true);

        	FrameGlobal.Funcionalidad();
        	
        	
//            new Dialog(miFrame).setVisible(true);
           
            return;
           
        }
        
        
        if(e.getSource()== miFrameGlobal.getSalir()) {
           System.exit(0);
           
        }
        
        
        
    }
	
	
	

}
