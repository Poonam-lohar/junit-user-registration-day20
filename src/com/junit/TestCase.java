package com.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCase {
    UserRegistration ur = new UserRegistration();
    @Test
    void testFirstname() {
        assertTrue(ur.firstName("Poonam"));
    }

    @Test
    void testLastname() {
        assertTrue(ur.lastName("Desai"));
    }
    @Test
    void testEmail() {
        assertTrue(ur.Email("loharpoonam98@gmail.com"));
    }
    @Test
    void testMobilenumber() {
        assertTrue(ur.MobNo("91 7058835985"));
    }
    @Test
    void testPassword() {
        assertTrue(ur.password("Poonam@15"));
    }
}
