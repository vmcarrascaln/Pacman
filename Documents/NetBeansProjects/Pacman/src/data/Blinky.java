/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;

/**
 *
 * @author Victor Carrascal
 */
public class Blinky extends Fantasmas {
    
    private Color Rojo;
    
    Color blinky = new Color(255,0,0);

    public Blinky(String nombre, String color, int posicionX, int posicionY) {
        super(nombre, color, posicionX, posicionY);
    }
}
