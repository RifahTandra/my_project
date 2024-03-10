package cse430lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	 public void testCapitalizeWords() {
        StringManipulatorClass2 manipulator = new StringManipulatorClass2();
        assertEquals("Hello World", manipulator.capitalizeWords("hello world"));
        assertEquals("This Is A Test", manipulator.capitalizeWords("this is a test"));
        assertEquals("12345 Abc Def", manipulator.capitalizeWords("12345 abc def"));
    }

    @Test
    public void testRemoveNonAlphabetic() {
        StringManipulatorClass2 manipulator = new StringManipulatorClass2();
        assertEquals("HelloWorld", manipulator.removeNonAlphabetic("Hello123World"));
        assertEquals("ThisIsATest", manipulator.removeNonAlphabetic("This,Is.A:Test"));
        assertEquals("Abcdef", manipulator.removeNonAlphabetic("12345Abcdef"));
    }

    @Test
    public void testContainsSubstring() {
        StringManipulatorClass2 manipulator = new StringManipulatorClass2();
        assertTrue(manipulator.containsSubstring("hello world", "world"));
        assertFalse(manipulator.containsSubstring("hello world", "universe"));
        assertTrue(manipulator.containsSubstring("this is a test", "test"));
    }

    @Test
    public void testMergeStrings() {
        StringManipulatorClass2 manipulator = new StringManipulatorClass2();
        assertEquals("HelloWorld", manipulator.MergeStrings("Hello", "World"));
        assertEquals("ThisIsATest", manipulator.MergeStrings("This", "IsATest"));
        assertEquals("12345Abcdef", manipulator.MergeStrings("12345", "Abcdef"));
    }

    @Test
    public void testReverseWords() {
        StringManipulatorClass2 manipulator = new StringManipulatorClass2();
        assertEquals("world hello", manipulator.reverseWords("hello world"));
        assertEquals("test a is This", manipulator.reverseWords("This is a test"));
        assertEquals("def abc 12345", manipulator.reverseWords("12345 abc def"));
    }
}