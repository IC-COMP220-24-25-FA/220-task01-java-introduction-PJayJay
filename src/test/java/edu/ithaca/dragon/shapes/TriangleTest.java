package edu.ithaca.dragon.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testCalcArea(){
        Triangle tester=new Triangle(5,5);
        assertEquals(12.5,tester.calcArea());

        tester=new Triangle(10,30);
        assertEquals(150, tester.calcArea());

        tester=new Triangle(.5,1);
        assertEquals(.25,tester.calcArea());

    }

    @Test
    public void testDouble(){
        Triangle tester=new Triangle(5,5);
        tester.doubleSize();
        assertEquals(50, tester.calcArea());

        tester.doubleSize();
        assertEquals(200, tester.calcArea());

        tester=new Triangle(.5, 1);
        tester.doubleSize();
        assertEquals(1, tester.calcArea());


    }
    
    @Test
    public void testLongestLineWithin(){

        Triangle tester=new Triangle(5,5);
        assertEquals(Math.sqrt(50), tester.longestLineWithin());

        tester=new Triangle(10,60);
        assertEquals(Math.sqrt(3700), tester.longestLineWithin());

        tester=new Triangle(.5,1);
        assertEquals(Math.sqrt(1.25), tester.longestLineWithin());
    }
}
