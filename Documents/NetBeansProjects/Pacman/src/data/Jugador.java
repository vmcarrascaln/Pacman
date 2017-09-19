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
public class Jugador {
    
    private String Nombre;
    private int PosicionX;
    private int PosicionY;
    private long Puntaje;

    public Jugador(String Nombre, int PosicionX, int PosicionY, long Puntaje) {
        this.Nombre = Nombre;
        this.PosicionX = PosicionX;
        this.PosicionY = PosicionY;
        this.Puntaje = Puntaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPosicionX() {
        return PosicionX;
    }

    public void setPosicionX(int PosicionX) {
        this.PosicionX = PosicionX;
    }

    public int getPosicionY() {
        return PosicionY;
    }

    public void setPosicionY(int PosicionY) {
        this.PosicionY = PosicionY;
    }

    public long getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(long Puntaje) {
        this.Puntaje = Puntaje;
    }
    
}
