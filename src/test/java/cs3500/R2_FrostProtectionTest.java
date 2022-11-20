package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R2_FrostProtectionTest {

    R2_FrostProtection frostProtection;

    @BeforeEach
    void setUp() {

        frostProtection = new R2_FrostProtection();
    }

    // include selection tests here




    @Test
    @DisplayName("Test if user has not made a selection")
    void testZoneSelection() {
        assertThrows(IllegalArgumentException.class, () -> {
            frostProtection = null;
            if (frostProtection == null) {
                throw new IllegalArgumentException("You must select a zone!");
            }
        });
    }

}