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
public class Pinky extends Fantasmas{
    
    private Color Rosa;
    
    Color pinky = new Color (255,175,175);

    public Pinky(String nombre, String color, int posicionX, int posicionY) {
        super(nombre, color, posicionX, posicionY);
    }
    
}
