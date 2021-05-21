package com.uangio.swingeasy;

import javax.swing.JButton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Llamada de boton");
       
    }

    public JButton drawButton(String text, int x, int y, int sizeX, int sizeY) {
        JButton button = new JButton();
        button.setText(text);
        button.setSize(sizeX, sizeY);
        button.setLocation(x, y);
        return button;
    }

}
