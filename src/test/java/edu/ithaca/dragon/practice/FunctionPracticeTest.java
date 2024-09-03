package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(20, FunctionPractice.calcSalePrice(40,.60,.25));
        assertEquals(44.1,FunctionPractice.calcSalePrice(60, .30, .050));
        assertEquals(16.8, FunctionPractice.calcSalePrice(30, .5, .12));
        assertEquals(82.5, FunctionPractice.calcSalePrice(100,.25,.1));
    }

    @Test
    public void firstLargestTest(){
        List<Integer>tester=new ArrayList<Integer>();
        assertEquals(-1,FunctionPractice.findFirstLargest(tester));
        tester.add(15);
        tester.add(10);
        assertEquals(0,FunctionPractice.findFirstLargest(tester));
        tester.add(13);
        tester.add(15);
        assertEquals(0,FunctionPractice.findFirstLargest(tester));
        tester.add(20);
        assertEquals(4, FunctionPractice.findFirstLargest(tester));
    }
    @Test
    public void lastLargestTest(){
        List<Integer>tester=new ArrayList<Integer>();
        assertEquals(-1,FunctionPractice.findFirstLargest(tester));
        tester.add(15);
        tester.add(10);
        assertEquals(0,FunctionPractice.findFirstLargest(tester));
        tester.add(13);
        tester.add(15);
        assertEquals(3,FunctionPractice.findFirstLargest(tester));
        tester.add(20);
        assertEquals(4, FunctionPractice.findFirstLargest(tester));
    }

    @Test
    public void findMostTest(){
        List<String> tester= new ArrayList<String>();
        tester.add("howdy");
        tester.add("wow");
        tester.add("wowww");
        assertEquals("wowww", FunctionPractice.findFirstMostOccurencesOfLetter(tester, 'w'));
        tester.add("nahh");
        assertEquals("nahh", FunctionPractice.findFirstMostOccurencesOfLetter(tester, 'h'));
        tester.add("thatd");
        tester.add("what");
        assertEquals("howdy", FunctionPractice.findFirstMostOccurencesOfLetter(tester, 'd'));
    }
    
}
