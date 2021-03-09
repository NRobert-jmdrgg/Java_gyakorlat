package testtomeg;

public class Szemely {
    private final String nev;
    private double magassag;
    private int suly;

    public Szemely(String nev, double magassag, int suly) {
        this.nev = nev;
        this.magassag = magassag;
        this.suly = suly;
    }

    public Szemely(String nev, double magassag) {
        this.nev = nev;
        this.magassag = magassag;
        this.suly = 50;
    }

    public Szemely(String nev) {
        this.nev = nev;
        this.suly = 50;
        this.magassag = 175;
    }

    public String getNev() {
        return nev;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "nev: " + this.nev + " suly " + this.suly + " magassag: " + this.magassag + " tti: " + this.testtomegIndex() + " alak: " + this.alak();
    }
    
    private double testtomegIndex() {
        return this.suly / (this.magassag * this.magassag);
    }

    private String alak() {
        if(this.testtomegIndex() < 18.5) {
            return "sovany";
        } else if(this.testtomegIndex() > 25) {
            return "kover";
        } else {
            return "normal";
        }
        
    }
}
