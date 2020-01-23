package test;

import main.BalancedBrackets;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BalancedBracketsTest {
    private static int numTestsRun = 0;

    //TODO: add tests here
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting balanced brackets test");
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void wrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void wordsWithGoodBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void goodBracketsBeforeWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void oneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void reverseBracketsWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void nestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void misnestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]Code[]"));
    }
    @Test
    public void mismatchedBracketsThatCloseStillReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]"));
    }
    @Test
    public void funkierBracketsStillReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }
    @After
    public void after(){
        System.out.println("Test #" + ++numTestsRun + " run");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Total number of tests run: " + numTestsRun);
    }

}
