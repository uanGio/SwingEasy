package com.uangio.swingeasy;

import javax.swing.JButton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }

    public JButton drawButton(String text, int x, int y, int sizeX, int sizeY) {
        JButton obj = new JButton();
        obj.setText(text);
        obj.setSize(sizeX, sizeY);
        obj.setLocation(x, y);
        return obj;
    }

}
