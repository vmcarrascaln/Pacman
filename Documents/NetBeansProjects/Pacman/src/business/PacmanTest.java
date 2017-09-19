/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.awt.PopupMenu;
import javax.swing.JFrame;


public class PacmanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public void run() {

        JFrame frame = new JFrame();
        frame.setTitle("Pacman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PopupMenu ver = null;
        frame.getContentPane().add(ver);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
