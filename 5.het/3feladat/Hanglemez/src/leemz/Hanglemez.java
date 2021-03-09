package leemz;

public class Hanglemez {
    private String eloado;
    private String cim;
    private int hossz;

    public Hanglemez(String eloado, String cim, int hossz) {
        this.eloado = eloado;
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String toString() {
        return "cim:" + cim + ", eloado:" + eloado + ", hossz:" + hossz + " perc";
    }

    public int longerThan(int len) {
        if(this.hossz > len) return 1;
        else if (this.hossz == len) return 0;
        else return -1;
    }

    public boolean ezAzEloado(String name) {
        return (this.eloado.equalsIgnoreCase(name));
    }

    public String getEloado() {
        return eloado;
    }

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

}
