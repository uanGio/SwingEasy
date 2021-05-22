/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uangio.swingeasy.Draws;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author giovanny
 */
public class Button{
    
    JButton btn = new JButton();
    
    Image icon;
    
    public void draw(JFrame frame,String text){
        btn.setText(text);
        
        frame.add(btn);
    }
    
    public void draw(JPanel panel,String text, int x, int y, int Width, int Height){
        btn.setSize(Width, Height);
        btn.setLocation(x, y);
        btn.setText(text);
        
        panel.add(btn);    
    }
    
    public void changeText(String newText){
        btn.setText(newText);
    }
    
    public void fontColor(Color fontColor){
        btn.setForeground(fontColor);
    }
    
    public void backgroundColor(Color backgroundColor){
        btn.setBackground(backgroundColor);
    }
    
    public void drawImage(String iconLocation) throws IOException{
        icon = ImageIO.read(getClass().getResource(iconLocation));
        
        btn.setIcon(new ImageIcon(icon));
    }
    
    public void mouseClick(MouseAction ma){
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (me.getButton() == MouseEvent.BUTTON1) {
                    ma.leftClick();
                }
                if (me.getButton() == MouseEvent.BUTTON2) {
                    ma.centerClick();
                }
                if (me.getButton() == MouseEvent.BUTTON3) {
                    ma.rightclick();
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ma.insideMouse();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ma.outsideMouse();
            }
        });
    }
    
}
