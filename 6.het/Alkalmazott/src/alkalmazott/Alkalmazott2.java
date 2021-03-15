package alkalmazott;

public class Alkalmazott2 {
    //objektum adattagok
    private String nev;
    private int eletkor;
    private int fizetes;

    //osztaly adattagok
    private static int nyugdijKorhatar = 65;

    //konstruktorok
    public Alkalmazott2(String nev, int eletkor, int fizetes) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.fizetes = fizetes;
    }

    public Alkalmazott2(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.fizetes = 10 * this.eletkor;
    }

    public int evekNyugdijig() {
        return nyugdijKorhatar - this.eletkor;
    }

    @Override
    public String toString() {
        return "alkalmazott [eletkor=" + eletkor + ", fizetes=" + fizetes + ", nev=" + nev + "]";
    }

    //osztaly methodusok
        

    
}
