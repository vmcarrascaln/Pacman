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
public class Pastillas {
    
    private int tamaño;
    private Color color;
    private int posicionX;
    private int posicionY;
    

    public Pastillas(int tamaño, Color color, int posicionX, int posicionY) {
        this.tamaño = tamaño;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
     public static void mostrar(){
        
        
    }
}
