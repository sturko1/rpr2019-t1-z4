package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    private  int brojartikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int getBrojartikala() {
        return brojartikala;
    }

    public boolean dodajArtikl (Artikl a) {
        if (brojartikala == 50) return false;
        else {
            artikli[brojartikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojartikala++;
            return true;
        }
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

    public int dajUkupnuCijenuArtikala() {
        int racun = 0;
        for (int i = 0; i < brojartikala; i++) racun = racun + artikli[i].getCijena();

        return racun;
    }
}




