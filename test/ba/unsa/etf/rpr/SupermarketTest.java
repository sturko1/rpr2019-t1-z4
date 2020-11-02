package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Artikl[] artikli = new Artikl[3];
        artikli[0] = new Artikl("biciklo", 2000, "12");
        artikli[1] = new Artikl("biciklo", 1000, "13");
        artikli[2] = new Artikl("biciklo", 3000, "14");

        Supermarket sm = new Supermarket();
        for (int i = 0; i < 3; i++) sm.dodajArtikl(artikli[i]);

        sm.izbaciArtiklSaKodom("12");

        assertEquals(2, sm.getBrojartikala());

    }

    @Test
    void dodajArtikl() {

        Artikl[] artikli = new Artikl[3];
        artikli[0] = new Artikl("biciklo", 2000, "12");
        artikli[1] = new Artikl("biciklo", 1000, "13");
        artikli[2] = new Artikl("biciklo", 3000, "14");

        Supermarket sm = new Supermarket();
        for (int i = 0; i < 3; i++) sm.dodajArtikl(artikli[i]);


        assertEquals(3, sm.getBrojartikala());

    }
}