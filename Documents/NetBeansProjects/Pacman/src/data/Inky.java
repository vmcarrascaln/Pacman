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
public class Inky extends Fantasmas {
    
    private Color Cian;
    
    Color inky = new Color(0,255,255);

    public Inky(String nombre, String color, int posicionX, int posicionY) {
        super(nombre, color, posicionX, posicionY);
    }
    
}
