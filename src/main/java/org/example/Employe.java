package org.example;

public class Employe extends Personne implements Mensuelisable {

    private int salaireAnnuel;

    public Employe(String nom, int salaireAnnuel) {
        super(nom);
        this.salaireAnnuel = salaireAnnuel;
    }

    public int getSalaireAnnuel() {
        return salaireAnnuel;
    }

    public void setSalaireAnnuel(int salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    @Override
    public int getCoutMensuel() {
        return this.salaireAnnuel/12;
    }
}
