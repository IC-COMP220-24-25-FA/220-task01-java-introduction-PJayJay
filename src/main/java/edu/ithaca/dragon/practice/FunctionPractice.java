package edu.ithaca.dragon.practice;

import java.util.List;



import javax.management.RuntimeErrorException;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if(first<0 || second<0 || third<0){
            throw new IllegalArgumentException();
        }
        if(first>=second &&first>=third){
            return first;
        }
        else if(second>=first&&second>=third){
            return second;
        }
        else{
            return third;
        }
    }

    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double amountLeft=1.00-discountPercent;
        double totalAmount=originalPrice*amountLeft;
        double cashTax=totalAmount*salesTax;
        totalAmount=totalAmount+cashTax;
        return totalAmount;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        int totalCount=0;
        String theWord="";
        int thisCount=0;
        for(int i=0;i<words.size();i++){
            thisCount=0;
            for(int j=0;j<words.get(i).length();j++){
                if(words.get(i).charAt(j)==letter){
                    thisCount++;
                }
            }
            if (thisCount>totalCount){
                totalCount=thisCount;
                theWord=words.get(i);
            }
            
        }
        return theWord;
    }




}
