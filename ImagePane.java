package test;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class ImagePane extends JPanel {
     
    private static final long   serialVersionUID    = 1L;
     
    protected BufferedImage buffer;
    protected String li;
     
    public ImagePane(String li){
        this.li = li;
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        Image img = tk.getImage(li);
//        this.buffer= new BufferedImage(
//            4000,4000,BufferedImage.TYPE_INT_RGB);
//        this.buffer.createGraphics().drawImage(img, null, null);
        File f = new File(li);
        try {
           this.buffer = ImageIO.read(f);
           System.out.println(this.buffer.getWidth());
        }catch (IOException e) {
           e.printStackTrace();
        }

    }  
         
    public void paintComponent(Graphics g) {
       g.drawImage(buffer,0,0,null);
     }
}