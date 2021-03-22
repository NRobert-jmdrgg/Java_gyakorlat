package myproducts;

public class Product {
    private String nev;
    private int ar;
    private int afakulcs;

    public Product(String nev, int ar, int afakulcs) {
        this.nev = nev;
        this.ar = ar;
        this.afakulcs = afakulcs;
    }

    public int bruttoAr() {
        return this.ar * (afakulcs / 100);
    }

    @Override
    public String toString() {
        return "Product [afakulcs=" + afakulcs + ", ar=" + ar + ", nev=" + nev + "]";
    }

    public void arNoveles(int szazalek) {
        this.ar *= (szazalek / 100);
    }

    public int arOsszehasonlit(Product a) {
        if (this.ar > a.ar) {
            return 1;
        } else if (a.ar > this.ar) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
}
