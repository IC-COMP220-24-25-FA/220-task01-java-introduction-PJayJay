package edu.ithaca.dragon.shapes;

import javax.management.RuntimeErrorException;

public class Triangle implements Shape{
    private double height;
    private double width;

    public Triangle(double h, double w){
        height=h;
        width=w;
    }

    public String toString(){
        return "This triangle is "+height+" high and "+width+" wide";
    }

    public double calcArea(){

        return (height*width)/2.0;

    }

    public void doubleSize(){
        height=height*2;
        width=width*2;

    }

    public double longestLineWithin(){

        double aSquared=height*height;
        double bSquared=width*width;
        double cSquared=aSquared+bSquared;
        return Math.sqrt(cSquared);

    }
    
}
