package alkalmazott;

import java.time.LocalDate;

public class Alkalmazott {
    //objektum adattagok
    private String nev;
    private LocalDate szuletesiDatum;
    private int fizetes;

    //osztaly adattagok
    private static final int NYUGDIJKORHATAR = 65;

    private LocalDate currentDate = LocalDate.now();
    private int currentYear = currentDate.getYear();

    //konstruktorok
    public Alkalmazott(String nev, LocalDate szuletesiDatum, int fizetes) {
        this.nev = nev;
        this.szuletesiDatum = szuletesiDatum;
        this.fizetes = fizetes;
    }    

    public Alkalmazott(String nev, LocalDate szuletesiDatum) {
        this.nev = nev;
        this.szuletesiDatum = szuletesiDatum;
        this.fizetes = (currentYear - this.szuletesiDatum.getYear()) * 10000;
    }

    public int evekNyugdijig() {
        if (NYUGDIJKORHATAR - (currentYear - this.szuletesiDatum.getYear()) <= 0) {
            return 0;
        } else {
            return currentYear - this.szuletesiDatum.getYear();
        }
    }

    @Override
    public String toString() {
        return "Alkalmazott [fizetes=" + fizetes + ", nev=" + nev + ", szuletesiDatum=" + szuletesiDatum + "]";
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
        NYUGDIJKORHATAR = korhatar;
    }

    

    

    
}
