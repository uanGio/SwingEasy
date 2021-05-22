package com.uangio.swingeasy.Draws;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author giovanny
 */
public class Label{
    
    JLabel lbl = new JLabel();
    Image image;
    
    public void draw(JFrame frame,String text){
        lbl.setText(text);
        
        frame.add(lbl);
    }
    
    public void draw(JPanel panel,String text, int x, int y, int Width, int Height){
        lbl.setSize(Width, Height);
        lbl.setLocation(x, y);
        lbl.setText(text);
        
        panel.add(lbl);
    }
    
    public void draw(JPanel panel,String text, int x, int y, int Width, int Height, Color fontColor){
        lbl.setSize(Width, Height);
        lbl.setLocation(x, y);
        lbl.setText(text);
        lbl.setForeground(fontColor);
        
        panel.add(lbl);
    }
    
    public void changeText(String newText){
        lbl.setText(newText);
    }
    
    public void textColor(Color fontColor){
        lbl.setForeground(fontColor);
    }
    
    public void backgroundColor(Color backgroundColor){
        lbl.setOpaque(true);
        lbl.setBackground(backgroundColor);
    }
    
    public void drawImage(String iconLocation) throws IOException{
        image = ImageIO.read(getClass().getResource(iconLocation));
        
        lbl.setIcon(new ImageIcon(image));
    }    
    
}
