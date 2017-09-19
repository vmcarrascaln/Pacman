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
public class Frutas {
    
    private String tipo;
    private String nombre;
    private Color color;
    private int posicionX;
    private int posicionY;
    private int tamaño;
    private int tiempo;
    
    public Frutas(){
      
      Frutas cereza = new Frutas();
      Frutas fresa = new Frutas();
      Frutas Naranja = new Frutas();
      Frutas manzana = new Frutas();
      Frutas uva = new Frutas();
      Frutas campana = new Frutas();
      Frutas Llave = new Frutas();
      
  }  

    public Frutas(String tipo, String nombre, Color color, int posicionX, int posicionY, int tamaño, int tiempo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tamaño = tamaño;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

  
}
