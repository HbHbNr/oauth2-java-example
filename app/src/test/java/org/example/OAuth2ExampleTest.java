package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        OAuth2Example classUnderTest = new OAuth2Example();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}