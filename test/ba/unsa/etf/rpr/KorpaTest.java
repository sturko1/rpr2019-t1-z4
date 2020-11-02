package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("biciklo", 1000, "253");
        assertEquals(0, korpa.getBrojartikala());
        korpa.dodajArtikl(a);
        assertEquals(1, korpa.getBrojartikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("biciklo", 1000, "253");
        assertEquals(0, korpa.getBrojartikala());
        korpa.dodajArtikl(a);
        assertEquals(1, korpa.getBrojartikala());
        korpa.izbaciArtiklSaKodom("253");
        assertEquals(0, korpa.getBrojartikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl[] artikli = new Artikl[3];
        artikli[0] = new Artikl("biciklo", 2000, "12");
        artikli[1] = new Artikl("biciklo", 1000, "13");
        artikli[2] = new Artikl("biciklo", 3000, "14");

        Korpa korpa = new Korpa();
        for (int i = 0; i < 3; i++) korpa.dodajArtikl(artikli[i]);

        assertEquals(6000, korpa.dajUkupnuCijenuArtikala());
    }
}