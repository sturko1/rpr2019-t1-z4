package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl[1000];
    private int brojartikala = 0;


    public Artikl[] getArtikli() {
        return artikli;
    }

    public int getBrojartikala() {
        return brojartikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocni = null;

        for (int i = 0; i < brojartikala; i++) {
            if (artikli[i].getKod().equals(kod)) {
                pomocni = artikli[i];
                if (brojartikala - i >= 0) System.arraycopy(artikli, i + 1, artikli, i, brojartikala - i);
                brojartikala--;
                break;
            }
        }
        return pomocni;
    }

    public void dodajArtikl(Artikl a) {
        if (brojartikala == 1000) {}
        else {
            artikli[brojartikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojartikala++;
        }
    }
}






