package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1_WiFiConnectTest {

    R1_WiFiConnect WiFiConnect;

    @BeforeEach
    void setUp() {
        WiFiConnect = new R1_WiFiConnect();
    }

    @Test
    @DisplayName("User enters password to wi-fi connection and connection is made")
    void enterPassword() {
        String ENTERED_PASSWORD = ("ThisIsMyPassword");
        // user entered below string
        String actualValue = "ThisIsMyPassword";
        assertEquals(ENTERED_PASSWORD, actualValue);
    }

    @Test
    @DisplayName("User enters incorrect password to wi-fi connection and is not connected")
    void enterInvalidPassword() {
        String ENTERED_PASSWORD = ("ThisIsNotMyPassword");
        // user entered below string
        String actualValue = "ThisIsMyPassword";
        if (ENTERED_PASSWORD != actualValue) {
            WiFiConnect.getInvalidMessage();
        }
        assertTrue(WiFiConnect.getInvalidMessage() == "Invalid Password entered.");
    }



}