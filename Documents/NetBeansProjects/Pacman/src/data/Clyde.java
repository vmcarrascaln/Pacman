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

// Clyde no persigue a Pac-Man, sino que deambula por el laberinto sin una ruta específica.
public class Clyde extends Fantasmas{
    
    private Color Naranja;
    
    Color clyde = new Color (255,200,0);

    public Clyde(String nombre, String color, int posicionX, int posicionY) {
        super(nombre, color, posicionX, posicionY);
    }
    
}
