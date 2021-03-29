package com.ramesh.springboot.coreJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test method is enabled");
    }

    @Test
    void countweprocess() {
        System.out.println("Count method is started");
    }
}