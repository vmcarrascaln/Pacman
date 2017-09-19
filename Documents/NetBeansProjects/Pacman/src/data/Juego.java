/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Carrascal
 */
public class Juego {
    public Dimension screenSize;
    public Point2D screenScale;
    
    public List<Jugador> actors = new ArrayList<Jugador>();
   

    public void init() {
}
}
