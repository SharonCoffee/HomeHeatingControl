package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R12_SystemsTest {

    R12_Systems systems;

    @BeforeEach
    void setUp() {

        systems = new R12_Systems();

    }
    @Test
    @DisplayName("Test if can get home name")
    void getSystemName() {
        String testName = "Unknown";

        assertEquals(testName, systems.getName());
    }
}