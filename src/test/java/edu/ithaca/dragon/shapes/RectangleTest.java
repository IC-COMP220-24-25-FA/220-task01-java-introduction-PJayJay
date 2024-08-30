package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calcAreaTest(){
        Rectangle myRec=new Rectangle(5,5);
        assertEquals(25,myRec.calcArea() );

        myRec=new Rectangle(6.5,2);
        assertEquals(13,myRec.calcArea());

        myRec=new Rectangle(0.5,0.3);
        assertEquals(.15, myRec.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRec=new Rectangle(5,5);
        myRec.doubleSize();
        assertEquals(100,myRec.calcArea() );

        myRec=new Rectangle(6.5,2);
        myRec.doubleSize();
        assertEquals(52,myRec.calcArea());

        myRec=new Rectangle(0.5,0.3);
        myRec.doubleSize();
        assertEquals(.6, myRec.calcArea());


    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRec=new Rectangle(5,5);
        assertEquals(7.0710678118654755,myRec.longestLineWithin() );

        myRec=new Rectangle(6.5,2);
        assertEquals(6.800735254367722,myRec.longestLineWithin());

        myRec=new Rectangle(0.5,0.3);
        assertEquals(0.58309518948453, myRec.longestLineWithin());

    }
    
}
