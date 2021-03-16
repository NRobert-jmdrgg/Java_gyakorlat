package alkalmazott;

import java.time.LocalDate;

public class Alkalmazott {
    //objektum adattagok
    private String nev;
    private int szuletesiDatum;
    private int fizetes;

    //osztaly adattagok
    private static int nyugdijKorhatar = 65;

    //konstruktorok
    public Alkalmazott(String nev, int eletkor, int fizetes) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.fizetes = fizetes;
    }

    public Alkalmazott(String nev, int eletkor) {
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
    public static Alkalmazott kevesebbIdoNyugdijig(Alkalmazott a, Alkalmazott b) {
        if (a.evekNyugdijig() > b.evekNyugdijig()) {
            return a;
        } else {
            return b;
        }
    }

    public static void setNyugdijkorhatar(int korhatar) {
        nyugdijKorhatar = korhatar;
    }

    
}
