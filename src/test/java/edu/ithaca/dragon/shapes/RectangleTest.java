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

    }

    @Test
    public void longestLineWithinTest(){

    }
    
}
