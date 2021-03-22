package myproducts;

public class Bread extends Product {
    private double mennyiseg;

    public Bread(String nev, int ar, int afakulcs, double mennyiseg) {
        super(nev, ar, afakulcs);
        this.mennyiseg = mennyiseg;
    }

    private double getEgysegar() {
        return this.bruttoAr() / mennyiseg;
    }

    @Override
    public String toString() {
        return "Product [afakulcs=" + afakulcs + ", ar=" + ar + ", nev=" + nev + ", egysegar: " + this.getEgysegar() + "]";
    }
    
    public double getMennyiseg() {
        return mennyiseg;
    }

    public static boolean egysegarOsszehasonlit(Bread a, Bread b) {
        return (a.getEgysegar() > b.getEgysegar());
    }


}
