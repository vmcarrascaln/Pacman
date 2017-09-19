/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Victor Carrascal
 */
public class Pacman {
    private Color color;
    private String estado;
    private int vidas;
    
    
    public void init() {
        String[] pacmanFrameNames = new String[30];
        for (int d=0; d<4; d++) {
            for (int i=0; i<4; i++) {
                pacmanFrameNames[i + 4 * d] = "/res/pacman_" + d + "_" + i + ".png";
            }
        }
        for (int i=0; i<14; i++) {
            pacmanFrameNames[16 + i] = "/res/pacman_died_" + i + ".png";
        }
        loadFrames(pacmanFrameNames);
        reset();
        Rectangle collider = new Rectangle(0, 0, 8, 8);
    }

    public Pacman(Color color, String estado, int vidas) {
        this.color = color;
        this.estado = estado;
        this.vidas = vidas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    private void loadFrames(String[] pacmanFrameNames) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
