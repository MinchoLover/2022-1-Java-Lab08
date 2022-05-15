package edu.handong.csee.java.hw2.math;

import java.lang.Math;

/**
 * This is MathCalculator Class.
 */
    public class MathCalculator{
        
        private String name;
    
    /**
     * this is setName method.
     * @param name -String name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * this is getName method.
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * this is getMax method.
     * @param a -int a
     * @param b -int b
     * @return Maximum number;
     */
    public int getMax(int a, int b){
        if(a>b)
            return a;
        else
            return b;
        
    }
    
    /**
     * this is getMin method.
     * @param a -int a
     * @param b -int b
     * @return Minimum number.
     */
    public int getMin(int a, int b){
        if(a>b)
            return b;
        else
            return a;
    }
    
    /**
     * this is getAbs method.
     * @param a -int a
     * @return Abs number.
     */
    public int getAbs(int a){
        if(a>=0)
            return a;
        else
            return -a;
        
    }
    
    /**
     * this is getSum method.
     * @param a -int a
     * @param b -int b
     * @return a+b
     */
    public int getSum(int a, int b){
        return a+b;
    }
    
    /**
     * this is getDiff method.
     * @param a -int a
     * @param b -int b
     * @return a-b
     */
    public int getDiff(int a, int b){
        return a-b;
        
    }
    
    /**
     * this is getProduct method.
     * @param a -int a
     * @param b -int b
     * @return a*b
     */
    public int getProduct(int a, int b){
        return a*b;
    }
    
    /**
     * this is getQuotient method.
     * @param a -int a
     * @param b -int b
     * @return a/b
     */
    public int getQuotient(int a, int b){
        return a/b;
    }
    
    /**
     * this is getRemainder method.
     * @param a -int a
     * @param b -int b
     * @return a%b
     */
    public int getRemainder(int a, int b){
        return a%b;
    }
    
    /**
     * this is getPower method.
     * @param a -int a
     * @param b -int b
     * @return Power number.
     */
    public int getPower(int a, int b){
        int value = (int) Math.pow(a, b);
        return value;
    }
    
    /**
     * this is getFactorial method.
     * @param a -int a
     * @return Factorial number.
     */
    public int getFactorial(int a){
        if (a <= 1)
            return a;
        else 
            return getFactorial(a-1) * a;
    
    }
    
    /**
     * this is getGcd method.
     * @param a -int a
     * @param b -int b
     * @return Gcd number.
     */
    public int getGcd(int a, int b){
        if(b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    } 

    /**
     * this is getLcm method.
     * @param a -int a
     * @param b -int b
     * @return Lcm number.
     */
    public int getLcm(int a, int b){
        return (a * b) / getGcd(a, b);
    }

    /**
     * this is getSquare method.
     * @param a -int a
     * @return Square number.
     */
    public int getSquare(int a){
        int value = (int) Math.sqrt(a);
        return value;
    } 
}
        
    
