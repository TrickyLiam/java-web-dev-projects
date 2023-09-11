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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBracketsStrReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("str"));
    }

    @Test
    public void strOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]str"));
    }

    @Test
    public void strInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[str]"));
    }

    @Test
    public void singleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleStrLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[str"));
    }

    @Test
    public void singleStrRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("str]"));
    }

    @Test
    public void wrongOnlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void wrongOuterStrBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][str"));
    }

    @Test
    public void wrongInnerStrBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]str["));
    }

}