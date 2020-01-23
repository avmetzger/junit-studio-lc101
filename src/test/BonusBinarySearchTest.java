package test;

import main.BonusBinarySearch;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

import java.lang.reflect.Array;

@RunWith(JUnit4.class)
public class BonusBinarySearchTest {
    private static int numTestsRun = 0;
    int[] numberArray;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Beginning tests on binary search...");
    }
    @Before
    public void init() {
        numberArray = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
    }
    @Test
    public void emptyTest() {
        assertEquals(0,0);
    }
    @Test
    public void searchForNumber(){
        assertEquals(BonusBinarySearch.binarySearch(numberArray, 5),4);
    }
    @Test
    public void searchForRepeatedNumber(){
        assertEquals(BonusBinarySearch.binarySearch(numberArray,1),1);
    }
    @Test
    public void searchForMiddleNumber(){
        assertEquals(BonusBinarySearch.binarySearch(numberArray,13),6);
    }
    @Test
    public void searchForNonIncludedNumber(){
        assertEquals(BonusBinarySearch.binarySearch(numberArray,15),-1);
    }
    @After
    public void testCount(){
        System.out.println("Test #"+ ++numTestsRun + " run.");
    }
}
