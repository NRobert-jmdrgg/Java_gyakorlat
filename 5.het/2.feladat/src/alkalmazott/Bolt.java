package alkalmazott;

public class Bolt {
    private int letszam;
    private Alkalmazott[] boltiAlkalmazottak;

    public Bolt(int letszam) {
        this.letszam = letszam;
        this.boltiAlkalmazottak = new Alkalmazott[letszam];
        feltolt();
    }

    private void feltolt() {
        for (int i = 0; i < boltiAlkalmazottak.length; i++) {
            boltiAlkalmazottak[i] = new Alkalmazott("bela " + (i + 1) , i + 10000);
        }
    }

    public int getLetszam() {
        return letszam;
    }

    public Alkalmazott[] getBoltiAlkalmazottak() {
        return boltiAlkalmazottak;
    }


}
