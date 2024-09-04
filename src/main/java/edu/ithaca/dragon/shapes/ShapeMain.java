package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        /*Rectangle a=new Rectangle(5,5);
        Rectangle b=new Rectangle(10,2);
        Rectangle c=new Rectangle(.5,1);
        Rectangle d=new Rectangle(15,20);
        Rectangle e=new Rectangle(2,4);
        List<Rectangle> listed= Arrays.asList(a,b,c,d,e);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(listed.get(j).calcArea());
            }
            Scanner myObj = new Scanner(System.in);
            System.out.println("Which rectangle do you want to double? 0,1,2,3,4?");
            int whichOne = myObj.nextInt();
            if(whichOne==0 || whichOne==1||whichOne==2||whichOne==3||whichOne==4){
                listed.get(whichOne).doubleSize();
            }
            else{
                System.out.println("That is not an option what is your problem man");
                while(whichOne!=0 && whichOne!=1&&whichOne!=2&&whichOne!=3&&whichOne!=4){
                    Scanner newObj = new Scanner(System.in);
                    System.out.println("Which rectangle do you want to double? 0,1,2,3,4?");
                    whichOne = newObj.nextInt();
                }
                listed.get(whichOne).doubleSize();
            }

        }*/
        List<Shape> listed=new ArrayList<Shape>();
        Random rand=new Random();
        for(int i =0;i<10;i++){
            int randomly=rand.nextInt(3);
            if(randomly==0){
                Shape uno=new Circle(rand.nextInt(20)+1);
                listed.add(uno);
            }
            else if(randomly==1){
                Shape dos=new Rectangle(rand.nextInt(20)+1,rand.nextInt(20)+1);
                listed.add(dos);
            }
            else{
                Shape tres=new Triangle(rand.nextInt(20)+1,rand.nextInt(20)+1);
                listed.add(tres);
            }
            System.out.println(listed.get(i));
        }
        System.out.println("doubling now");
        for(int i=0;i<10;i++){
            listed.get(i).doubleSize();
            System.out.println(listed.get(i));
        }

    }
}
