import Algorithms.RecursionPractice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        long startTime;
        long endTime;
        long result;
        int[]numbers=new int[100000];

        for(int i=0;i<numbers.length;i++){
        numbers[i]=rand.nextInt(1000000);
        }
        /*System.out.println("Czas sortowania 100.000 liczb z przedziału 0-1.000.000: ");
        Quicksort qsort=new Quicksort(numbers);
        startTime=System.nanoTime();
        qsort.quicksort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Quicksort time: "+ result/1000000+"ms" );

        Mergesort mergesort=new Mergesort(numbers);
        startTime=System.nanoTime();
        mergesort.mergesort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Mergesort time: "+ result/1000000+"ms" );

        Insertionsort insertionsort=new Insertionsort(numbers);
        startTime=System.nanoTime();
        insertionsort.insertionsort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Insertionsort time: "+ result/1000000+"ms" );

        Bubblesort bubblesort=new Bubblesort(numbers);
        startTime=System.nanoTime();
        bubblesort.bubblesort();
        endTime=System.nanoTime();
        result=endTime-startTime;

        System.out.println("Bubblesort time: "+ result/1000000+"ms" );

         */
        int x=526;
        int n=192;
        //System.out.println("Fibonacci result for " +n+": "+RecursionPractice.fibonaci(n));
        //System.out.println("Sum of digits result for " +n+": "+RecursionPractice.sumOfDigits(n));
        System.out.println("Power for " +x+"^"+n+": "+RecursionPractice.powPositiveNumber(x,n));
        System.out.println("GDC ("+x+","+n+") :"+ RecursionPractice.gcd(x,n));
        System.out.println(x+" = "+RecursionPractice.decimalToBinary(x,""));

    }

}
