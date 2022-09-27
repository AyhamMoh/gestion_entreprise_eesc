package org.example;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {


    public  Fenetre () {
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        setContentPane(panneau);

        JButton bouton  = new JButton ("Clic moi:D");
        panneau.add(bouton);

        ActionListener evenement = new ClicBouton();
        bouton.addActionListener(evenement);

        setVisible(true);
    }

    public static void main(String[] args) {
        new  Fenetre();
    }
}
