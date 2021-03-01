package konyvtar;

public class Konyv {
    private String cim;
    private String szerzo;
    private int ev;
    private int ar;

    public Konyv(final String cim, final String szerzo, final int ev,final int ar) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ev = ev;
        this.ar = ar;
    }
    public Konyv(final String cim, final String szerzo, final int ev) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ev = ev;
        this.ar = 1000;
    }

    public Konyv(final String cim, final String szerzo) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ev = 2000;
        this.ar = 1000;
    }
    @Override
    public String toString() {
        return this.cim  + " " + this.szerzo + " " + Integer.toString(this.ev) + " " + Integer.toString(this.ar);
    }

    public void setCim(final String c) {
        this.cim = c;
    }

    public void setSzerzo(final String s) {
        this.szerzo = s;
    }

    public void setEv(final int ev) {
        this.ev = ev;
    }

    public void setAr(final int a) {
        this.ar = a;
    }

    public void increaseByPercentage(final int p) {
        this.ar *= (p / 100);
    }

    public String getCim() {
        return this.cim;
    }

    public String getSzerzo() {
        return this.szerzo;
    }

    public int getEv() {
        return this.ev;
    }

    public int getAr() {
        return this.ar;
    }
}
