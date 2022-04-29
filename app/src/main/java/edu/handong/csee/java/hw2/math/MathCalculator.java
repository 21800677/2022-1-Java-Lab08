package edu.handong.csee.java.hw2.math;

/**
 * public class that includes various calculator
 */
public class MathCalculator {
    private String name;

    /**
     * @return private field name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name : get private field name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @param a : first param
     * @param b : second param
     * @return bigger param between a and b
     */
    public int getMax(int a, int b){
        return (a>b)? a:b;
    }
    /** *
     * @param a 
     * @param b
     * @return smaller param between a and b
     */
    public int getMin(int a, int b){
        return (a<b)? a:b;
    }
    /**
     * @param a
     * @return Absolute value of a
     */
    public int getAbs(int a){
        return (a>0)? a:-a;
    }
    /**
     * @param a
     * @param b
     * @return a+b
     */
    public int getSum(int a, int b){
        return a+b;
    }
    /**
     * @param a
     * @param b
     * @return a-b
     */
    public int getDiff(int a, int b){
        return a-b;
    }
    /**
     * @param a
     * @param b
     * @return a*b
     */
    public int getProduct(int a, int b){
        return a*b;
    }
    /**
     * @param a
     * @param b
     * @return Quotient of a/b
     */
    public int getQuotient(int a, int b){
        return a/b;
    }
    /**
     * @param a
     * @param b
     * @return Remaainder of a/b
     */
    public int getRemainder(int a, int b){
        return a%b;
    }
    /**
     * @param a
     * @param b
     * @return a^b(multiply a for b times)
     */
    public int getPower(int a, int b){
        int k = 1;
        for(int i = 0; i<b; i ++){
            k*=a;
        }
        return k;
    }
    /**
     * @param a
     * @return a!
     * a! = a(a-1)(a-2)*...*2*1
     */
    public int getFactorial(int a){
        int k = 1;
        for(int i = 0; i<a; i++){
            k = k*(a-i);
        }
        return k;
    }
    /**
     * @param a
     * @param b
     * @return Great common divisor by Euclidean algorithm
     * Euclidean algorithm : keep get remainder until remainder becomes 0
     */
    public int getGcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return getGcd(b, a%b);
    }
    /**
     * @param a
     * @param b
     * @return Least common multiple by deviding a*b with Gcd of a and b
     */
    public int getLcm(int a, int b){
        return a*b/getGcd(a,b);
    }
    /**
     * 
     * @param a
     * @return a*a
     */
    public int getSquare(int a){
        return a*a;
    }



}
