package edu.ithaca.dragon.shapes;

import javax.management.RuntimeErrorException;

public class Triangle {
    private double height;
    private double width;

    public Triangle(double h, double w){
        height=h;
        width=w;
    }

    public double calcArea(){

        return (height*width)/2.0;

    }

    public void doubleSize(){
        height=height*2;
        width=width*2;

    }

    public double longestLineWithin(){

        return 0.0;
    }
    
}
