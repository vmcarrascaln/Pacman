/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Victor Carrascal
 */
public class Fantasmas {
    
    private String nombre;
    private String color;
    private int posicionX;
    private int posicionY;

    public String getNombre() {
        return nombre;
    }

    public Fantasmas(String nombre, String color, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
    
    
}
