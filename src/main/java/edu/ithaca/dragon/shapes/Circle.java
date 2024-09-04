package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if(radius<=0){
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public String toString(){
        return "This circle has a radius of "+radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double pifer=Math.PI;
        double specialRad=this.radius*this.radius;
        return pifer*specialRad;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius=radius*2;
        
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double newRad=this.radius*2;
        return newRad;
    }
}
