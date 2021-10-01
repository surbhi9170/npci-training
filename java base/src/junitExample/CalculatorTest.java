package junitExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c=new Calculator(20,10);
    @Test
    void add() {
        c.add();
        assertEquals(30,30,c.add());
    }

    @Test
    void sub() {
        assertEquals(10,10,c.sub());

    }

    @Test
    void prod() {
        assertEquals(200,200,c.prod());

    }

    @Test
    void div() {
        assertEquals(2,2,c.div());

    }

    @Test
    void all() {
    }
}