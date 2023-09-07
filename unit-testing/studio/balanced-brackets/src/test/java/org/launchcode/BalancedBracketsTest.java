package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void testingSingleSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void testDoubleSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBracketAndString (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testEmptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testEmptyBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testSingleBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testBackwardBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void testOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testOppositeBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMultiOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void testMultiBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

}