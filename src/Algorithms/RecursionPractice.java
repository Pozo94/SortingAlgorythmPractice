package Algorithms;

public class RecursionPractice {
    public static int fibonaci(int n){
        if(n<0)
            return -1;
        if(n>=2)
            return fibonaci(n-1)+fibonaci(n-2);
        else {
            return n;
        }


    }
    public static int sumOfDigits(int n){
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        else {
            return n%10+sumOfDigits(n/10);
        }


    }
    public static int powPositiveNumber(int x,int n){
        if(n==0)
            return 1;
        else if(n<0)
            return -1;

        else {
            return x*powPositiveNumber(x,n-1);
        }


    }
    public static int gcd(int x,int n){
        int tmp;
        if(x==0)
            return n;
        if(n==0)
            return x;
        if(n<0||x<0)
            return -1;
        if(x<n){
            tmp=x;
            x=n;
            n=tmp;
        }
        if (x%n==0)
            return n;

        return gcd(n,x%n);

    }
    public static String decimalToBinary(int x,String bin){
        if(x<=0)
            return bin;
        return decimalToBinary(x/2,x%2+bin);


    }
    public static int factorial(int num) {
        if (num<=1) {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static int recursiveRange(int num) {
        if (num<=0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }
    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static Boolean isPalindrom(String str)
    {
        if (str.length()==0||str.length()==1)
            return true;
        //Calling Function Recursively
        if(str.charAt(0)==str.charAt(str.length()-1))
        return isPalindrom(str.substring(1,str.length()-1));

        return false;
    }
}
