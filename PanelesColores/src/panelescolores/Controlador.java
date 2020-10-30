/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelescolores;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Pepe
 */
public class Controlador implements MouseListener, ItemListener, ActionListener {

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

    @Override
    public void itemStateChanged(ItemEvent ie) {
        System.out.println(ie.getSource().toString());
        String lblPanel;
        CheckboxMenuItem chk = (CheckboxMenuItem) ie.getSource();
        lblPanel = chk.getLabel();

        switch (lblPanel) {
            case "Amarillo":
                if (!chk.getState()) {
                    vista.disableEscuchadorAmarillo();
                    System.out.println("Desactivo Amarillo");
                } else {
                    vista.enableEscuchadorAmarillo();
                    System.out.println("Activo Amarillo");
                }
                break;
            case "Verde":
                if (!chk.getState()) {
                    vista.disableEscuchadorVerde();
                    System.out.println("Desactivo Verde");
                } else {
                    vista.enableEscuchadorVerde();
                    System.out.println("Activo Verde");
                }
                break;

            case "Naranja":
                if (!chk.getState()) {
                    vista.disableEscuchadorNaranja();
                    System.out.println("Desactivo Naranja");
                } else {
                    vista.enableEscuchadorNaranja();
                    System.out.println("Activo Naranja");
                }
                break;

            case "Negro":
                if (!chk.getState()) {
                    vista.disableEscuchadorNegro();
                    System.out.println("Desactivo Negro");
                } else {
                    vista.enableEscuchadorNegro();
                    System.out.println("Activo Negro");
                }
                break;

            case "Azul":
                if (!chk.getState()) {
                    vista.disableEscuchadorAzul();
                    System.out.println("Desactivo Azul");
                } else {
                    vista.enableEscuchadorAzul();
                    System.out.println("Activo Azul");
                }
                break;

        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

}
