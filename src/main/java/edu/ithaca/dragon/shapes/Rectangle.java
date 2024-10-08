package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{

    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public String toString(){
        return "This rectangle is "+length+" long and "+width+" wide";
    }

    public double calcArea(){
       return this.length*this.width;
    }

    public void doubleSize(){
        this.length=this.length*2;
        this.width=this.width*2;
    }

    public double longestLineWithin(){
        double cSquared=((double)this.length*this.length)+((double)this.width*this.width);
        double cFinal=Math.sqrt(cSquared);
        return cFinal;
    }
    
}
