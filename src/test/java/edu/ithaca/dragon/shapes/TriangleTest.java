package edu.ithaca.dragon.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testCalcArea(){
        Triangle tester=new Triangle(5,5);
        assertEquals(13.5,tester.calcArea());

        tester=new Triangle(10,30);
        assertEquals(150, tester.calcArea());

        tester=new Triangle(.5,1);

    }

    @Test
    public void testDouble(){


    }
    
    @Test
    public void testLongestLineWithin(){


    }
}
