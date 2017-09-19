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
public abstract class Tablero {
    
    private int fila;
    private int columna;
    private int tamaño;

    public Tablero(int fila, int columna, int tamaño) {
        this.fila = fila;
        this.columna = columna;
        this.tamaño = tamaño;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
