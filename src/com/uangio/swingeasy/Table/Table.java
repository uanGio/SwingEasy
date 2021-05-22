package com.uangio.swingeasy.Table;

import com.uangio.swingeasy.Canva.Canva;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Table extends JFrame {

    private Canva c;

    public Table(String title, int SizeX, int SizeY) {
        Table(title, SizeX, SizeY, 0, 0, true);
    }

    public Table(String title, int SizeX, int SizeY, int PX, int PY) {
        Table(title, SizeX, SizeY, PX, PY, false);
    }

    private void Table(String title, int SizeX, int SizeY, int PX, int PY, boolean center) {
        this.setTitle(title);
        this.setSize(SizeX, SizeY);
        this.setLocation(PX, PY);
        if (center) {
            setLocationRelativeTo(this);
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setCanva(Canva c) {
        this.setContentPane(c);
    }

    public void setCanva(Canva c) {
        this.setContentPane(c);
    }

    public void Painting() {
        setVisible(true);
    }

}
