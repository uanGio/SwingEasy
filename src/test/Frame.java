/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.uangio.swingeasy.Draws.Button;
import com.uangio.swingeasy.Draws.Label;
import com.uangio.swingeasy.Draws.MouseAction;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author giovanny
 */
public class Frame extends JFrame implements MouseAction{
    
    FlowLayout layout1;
    
    Button button = new Button();
    Label label = new Label();
    
    public Frame() throws IOException{
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(layout1);
        
        this.setTitle("Hola");
        this.setSize(600, 450);
        this.setLocationRelativeTo(null);
        
        this.add(panel);
        
        button.draw(panel, "Adios", 150, 300, 200, 50);
        button.fontColor(Color.BLUE);
        button.mouseClick(this);
        button.backgroundColor(Color.darkGray);
        label.draw(panel, "Oprime el boton", 10, 20, 150, 30);
        label.textColor(Color.yellow);
        //label.backgroundColor(Color.darkGray);
        
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
               
    }

    @Override
    public void leftClick() {
        label.changeText("Boton Izquierdo");
    }

    @Override
    public void centerClick() {
        label.changeText("Boton Centro");
    }

    @Override
    public void rightclick() {
        label.changeText("Boton Derecho");
    }

    @Override
    public void insideMouse() {
        label.changeText("Mouse Encima");
    }

    @Override
    public void outsideMouse() {
        label.changeText("Mouse Afuera");
    }

}
