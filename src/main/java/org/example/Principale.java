package org.example;

import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {

        int coutMensuel = 0;
        ArrayList<Mensuelisable> listeMensuelisable=new ArrayList<>();
        listeMensuelisable.add(new Employe("BigBoss",120000));
        listeMensuelisable.add(new Employe("Stagaire",120000));
        listeMensuelisable.add(new Local(24,1000));
        listeMensuelisable.add(new Local(36,100));

        for (Mensuelisable mensuelisable:listeMensuelisable
             ) { coutMensuel += mensuelisable.getCoutMensuel();

        }


    }
}