package test;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
 
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
 
 
public class Zoom extends JComponent implements MouseWheelListener  {
    private static final long serialVersionUID = 1L;
    public int width, height;
    public BufferedImage img;
    public float zoom = 1f;
     
    public Zoom(int width, int height, InputStream is) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
        try {
            img = ImageIO.read(is);
        } catch (IOException e) { e.printStackTrace(); }
        addMouseWheelListener(this);
    }
     
    @Override
    protected void paintComponent(Graphics gd) {
        Graphics2D g = (Graphics2D) gd;
         
        AffineTransform t = new AffineTransform();
        //Ici je centre l'image
        float currentImgWidth = img.getWidth()*zoom, currentImgHeight = img.getHeight()*zoom;
        t.translate(width/2-currentImgWidth/2, height/2-currentImgHeight/2);
        //J'applique le "scale"
        t.scale(zoom, zoom);
        //Et j'affiche en utilisant la transformation
        g.drawImage(img, t, null);
         
        //On libère un peu de mémoire histoire de laisser le GC tranquille un peu plus longtemps
        g.dispose();
    }
 
    public void mouseWheelMoved(MouseWheelEvent e) {
        zoom -= 0.1f * e.getWheelRotation();
        repaint();
    }

}
