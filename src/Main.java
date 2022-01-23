import Algorithms.Bubblesort;
import Algorithms.Insertionsort;
import Algorithms.Mergesort;
import Algorithms.Quicksort;

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
        System.out.println("Czas sortowania 100.000 liczb z przedziału 0-1.000.000: ");
        Quicksort qsort=new Quicksort(numbers);
        startTime=System.nanoTime();
        qsort.quicksort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Quicksort time: "+ result/1000000 );
        //System.out.println("Before");
        //printArray(numbers);
        //System.out.println("After:");
        //printArray(qsort.quicksort());

        //printArray(numbers);
        Mergesort mergesort=new Mergesort(numbers);
        startTime=System.nanoTime();
        mergesort.mergesort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Mergesort time: "+ result/1000000 );
        //printArray(mergesort.mergesort());
        Insertionsort insertionsort=new Insertionsort(numbers);
        startTime=System.nanoTime();
        insertionsort.insertionsort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Insertionsort time: "+ result/1000000 );

        Bubblesort bubblesort=new Bubblesort(numbers);
        startTime=System.nanoTime();
        bubblesort.bubblesort();
        endTime=System.nanoTime();
        result=endTime-startTime;
        System.out.println("Bubblesort time: "+ result/1000000 );
    }
    public static void printArray(int[]array){

        for (int i:array
             ) {
            System.out.println(i);

        }
    }
}
