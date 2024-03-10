package cse430lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void testCalculateStringLength() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals(5, manipulator.calculateStringLength("Hello"));
        assertEquals(0, manipulator.calculateStringLength(""));
        assertEquals(11, manipulator.calculateStringLength("Hello World"));
    }

    @Test
    public void testReverseString() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals("olleH", manipulator.reverseString("Hello"));
        assertEquals("", manipulator.reverseString(""));
        assertEquals("dlroW olleH", manipulator.reverseString("Hello World"));
    }

    @Test
    public void testToLowerCase() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals("hello", manipulator.toLowerCase("Hello"));
        assertEquals("", manipulator.toLowerCase(""));
        assertEquals("hello world", manipulator.toLowerCase("Hello World"));
    }

    @Test
    public void testCountOccurrences() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals(2, manipulator.countOccurrences("hello", 'l'));
        assertEquals(0, manipulator.countOccurrences("", 'a'));
        assertEquals(3, manipulator.countOccurrences("hello world", 'o'));
    }

    @Test
    public void testRemoveDuplicates() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals("helo", manipulator.removeDuplicates("hello"));
        assertEquals("", manipulator.removeDuplicates(""));
        assertEquals("helo wrd", manipulator.removeDuplicates("hello world"));
    }
}