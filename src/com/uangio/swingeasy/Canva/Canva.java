package com.uangio.swingeasy.Canva;

import java.awt.Component;
import java.util.Collection;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Canva extends JPanel {

    public Canva(int SizeX, int SizeY, int x, int y, int layout) {
        Canva(SizeX, SizeY, x, y, layout);
    }

    public Canva(int SizeX, int SizeY, int layout) {
        Canva(SizeX, SizeY, SizeX, SizeY, layout);
    }

    private void Canva(int SizeX, int SizeY, int x, int y, int layout) {
        this.setSize(SizeX, SizeY);
        this.setLocation(x, y);
        switch (layout) {
            case 0:
                this.setLayout(null);
                break;
        }
    }

    public void addDraw(Component c) {
        this.add(c);
    }

    public void addAllDraw(Component... c) {
        for (Component component : c) {
            this.addDraw(component);
        }
    }
}
