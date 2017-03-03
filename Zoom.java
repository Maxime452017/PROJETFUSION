package test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Zoom extends JPanel implements MouseListener,MouseMotionListener{
   
   
 public void sdz(String filename) throws Exception {
         /*
         * insérer ici l'implémentation du mouseListener
         * Ca se passe de cette facon
         */
          this.addMouseListener(this);
          this.addMouseMotionListener(this);
 }

    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
        //lorsque la souris bouge
    public void mouseMoved(MouseEvent e) {
        System.out.println("Position: x= "+e.getX()+" y = "+e.getY());
    }
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Clic: x= "+e.getX()+" y = "+e.getY());
         
    }
 
   
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
         
    }
  
   
 public static void main(String args[]) throws Exception{
         new Test("D:/workspace/FUSION_IMAGE/src/test/RVB-FusionOrtho.png");
    }
}
