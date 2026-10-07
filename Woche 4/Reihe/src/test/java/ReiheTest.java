import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReiheTest {

    private static final double TOLERANZ = 1e-12;

    @Test
    public void testEinSummand() {
        assertEquals(1.0, Reihe.reihe(1), TOLERANZ);
    }

    @Test
    public void testZweiSummanden() {
        assertEquals(1.25, Reihe.reihe(2), TOLERANZ);
    }

    @Test
    public void testBeispielAusAufgabe() {
        assertEquals(1.4236111111111112, Reihe.reihe(4), TOLERANZ);
    }

    @Test
    public void testZehnSummanden() {
        assertEquals(1.5497677311665408, Reihe.reihe(10), TOLERANZ);
    }
}
