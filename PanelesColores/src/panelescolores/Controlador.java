/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelescolores;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Pepe
 */
public class Controlador implements MouseListener {

    private Vista vista;
    private Color color;

    public Controlador() {
        vista = new Vista(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       vista.setColorCabecera(color);    
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        String nombre;
        Panel panel = (Panel) me.getSource();
        if (!panel.getName().equals("GRANDE")) {
            color = panel.getBackground();
        }
        if (panel.getName().equals("GRANDE")) {
            vista.setColorGrande(color);
        }

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
