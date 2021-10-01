package junitExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestJunitTestCaseExample {
    JunitTestCaseExample obj = new JunitTestCaseExample();

    @Test
    public void testAdd() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        obj.add("Paul");
        assertEquals("Adding 4 student to list", "Adding 4 student to list", obj.sizeOfStudent());
    }

    @Test
    public void testSize() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        assertEquals("Adding 3 student to list", "Adding 3 student to list", obj.sizeOfStudent());
    }

    @Test
    public void testRemove() {
        obj.add("Antonio");
        obj.add("Paul");
        obj.remove("Paul");
        assertEquals("Adding 2 student to list", "Adding 2 student to list", obj.sizeOfStudent());
    }

    @Test
    public void removeAll() {
        obj.removeAll();
    }
}