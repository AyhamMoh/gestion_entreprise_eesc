package org.example;

public class Local implements Mensuelisable {
    private int surface;
    private  int coutMetrCarre;

    public Local(int surface, int coutMetrCarre) {
        this.surface = surface;
        this.coutMetrCarre = coutMetrCarre;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getCoutMetrCarre() {
        return coutMetrCarre;
    }

    public void setCoutMetrCarre(int coutMetrCarre) {
        this.coutMetrCarre = coutMetrCarre;
    }

    @Override
    public int getCoutMensuel() {
        return surface*coutMetrCarre;
    }
}
