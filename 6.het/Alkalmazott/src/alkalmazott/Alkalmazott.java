package alkalmazott;

import java.time.LocalDate;

public class Alkalmazott {
    //objektum adattagok
    private String nev;
    private LocalDate szuletesiDatum;
    private int fizetes;

    //osztaly adattagok
    private static final int NYUGDIJKORHATAR = 65;

    private static LocalDate currentDate = LocalDate.now();
    private static int currentYear = currentDate.getYear();

    private static String[] monthNames = {
        " ",
        "januar",
        "februar",
        "marcius",
        "aprilis",
        "majus",
        "junius",
        "julius",
        "augusztus",
        "szeptember",
        "oktober",
        "november",
        "december" 
    };

    public String convertMonthValue(int monthvalue) {
        return monthNames[monthvalue];
    }

    public int convertMonthName(String monthname) {
        for (int i = 1; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(monthname)) {
                return i;
            }
        }
        return 0;
    }
    

    //konstruktorok
    public Alkalmazott(String nev, int ev, int honap, int nap) {
        this.nev = nev;
        this.szuletesiDatum = LocalDate.of(ev, honap, nap);
        this.fizetes = (currentYear - this.szuletesiDatum.getYear()) * 10000;
    }    

    public Alkalmazott(String nev, int ev, String honap, int nap) {
        this.nev = nev;
        int honapErtek;
        if (convertMonthName(honap) == 0) {
            honapErtek = 1;
        } else {
            honapErtek = convertMonthName(honap);
        }
        this.szuletesiDatum = LocalDate.of(ev, honapErtek, nap);
        this.fizetes = currentYear - this.szuletesiDatum.getYear() * 10000;
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

    

    

    

    
}
