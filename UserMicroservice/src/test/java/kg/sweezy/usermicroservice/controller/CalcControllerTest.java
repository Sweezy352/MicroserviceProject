package kg.sweezy.usermicroservice.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcControllerTest {

    @Test
    void getTax() {
        CalcController calcController = new CalcController();
        assertEquals(0.12, calcController.getTax())
    }
}