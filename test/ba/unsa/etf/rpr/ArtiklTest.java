package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void TestKonstruktora() {
        Artikl a = new Artikl("biciklo", 1000, "253");
        assertEquals("biciklo", a.getNaziv());
        assertEquals(1000, a.getCijena());
        assertEquals("253", a.getKod());
    }


}