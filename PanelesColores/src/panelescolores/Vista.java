/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelescolores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author Pepe
 */
public class Vista extends Frame {

    private Controlador controlador;
    private Panel panelGrande;
    private Panel panelYellow;
    private Panel panelGreen;
    private Panel panelOrange;
    private Panel panelBlue;
    private Panel panelBlack;
    private Color color;
    private Label lblCabecera;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
        this.setBounds(500, 400, 250, 350);
        this.setLayout(new GridLayout(3, 0));
        Panel panelCabecera = new Panel();
        Panel panelCentral = new Panel();
        panelCentral.setLayout(new BorderLayout(30,30));
        Panel panelCentralIzda = new Panel();  //
        Panel panelCentralDcha = new Panel();   //

        Panel panelAbajo = new Panel();
        panelAbajo.setLayout(new GridLayout(0, 5));
        this.add(panelCabecera);
        this.add(panelCentral);
        this.add(panelAbajo);

        lblCabecera = new Label("TRINITARIAS");
        lblCabecera.setFont(new Font("Arial", Font.PLAIN, 20));
        panelCabecera.add(lblCabecera);

        panelGrande = new Panel();
        panelGrande.setName("GRANDE");
        panelGrande.setSize(new Dimension(50, 50));  // Dimensión
        panelGrande.setBackground(Color.yellow);
        panelGrande.addMouseListener(controlador);
        panelCentral.add(BorderLayout.WEST, panelCentralIzda);
        panelCentral.add(BorderLayout.CENTER, panelGrande);
        panelCentral.add(BorderLayout.EAST, panelCentralDcha);

        panelYellow = new Panel();
        panelYellow.setBackground(Color.yellow);
        panelYellow.addMouseListener(controlador);
        panelAbajo.add(panelYellow);

        panelGreen = new Panel();
        panelGreen.setBackground(Color.green);
        panelGreen.addMouseListener(controlador);
        panelAbajo.add(panelGreen);

        panelOrange = new Panel();
        panelOrange.setBackground(Color.orange);
        panelOrange.addMouseListener(controlador);
        panelAbajo.add(panelOrange);

        panelBlack = new Panel();
        panelBlack.setBackground(Color.black);
        panelBlack.addMouseListener(controlador);
        panelAbajo.add(panelBlack);

        panelBlue = new Panel();
        panelBlue.setBackground(Color.blue);
        panelBlue.addMouseListener(controlador);
        panelAbajo.add(panelBlue);

        this.setVisible(true);
    }

    public void setColorGrande(Color color) {
        panelGrande.setBackground(color);

    }

    public void setColorCabecera(Color color) {

        this.lblCabecera.setForeground(color);
    }

    private static class Dimension extends java.awt.Dimension {   // CLASE Dimension

        public Dimension(int i, int i0) {
        }
    }

}
