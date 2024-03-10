package cse430lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {

	@Test
	public void testIsPalindrome() {
        StringManipulatorClass3 manipulator = new StringManipulatorClass3();
        assertTrue(manipulator.isPalindrome("madam"));
        assertTrue(manipulator.isPalindrome("Madam"));
        assertFalse(manipulator.isPalindrome("hello"));
        assertTrue(manipulator.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testRemoveExtraSpaces() {
        StringManipulatorClass3 manipulator = new StringManipulatorClass3();
        assertEquals("hello world", manipulator.removeExtraSpaces("   hello    world   "));
        assertEquals("This is a test", manipulator.removeExtraSpaces("This  is   a   test"));
        assertEquals("12345 abc def", manipulator.removeExtraSpaces("  12345  abc  def "));
    }

    @Test
    public void testSwapCase() {
        StringManipulatorClass3 manipulator = new StringManipulatorClass3();
        assertEquals("HELLO world", manipulator.swapCase("hello WORLD"));
        assertEquals("tHIS IS A TEST", manipulator.swapCase("This is a test"));
        assertEquals("12345 ABC def", manipulator.swapCase("12345 abc DEF"));
    }
}