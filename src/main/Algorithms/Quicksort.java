package main.Algorithms;

import java.util.Random;

public class Quicksort {
     Random rand=new Random();
     public int[]array;
     public Quicksort(int[] array){
         this.array=array.clone();
     }
     public int[] quicksort(){
         quicksort(0,array.length-1);
         return array;
     }
    public void quicksort(int lowIndex,int highIndex){
        if(lowIndex>=highIndex){
            return ;
        }
        int pivotIndex=rand.nextInt(highIndex-lowIndex)+lowIndex;
        int pivot= array[pivotIndex];
        swap(array,pivotIndex,highIndex);
        int leftPointer =getPartitions(array, lowIndex, highIndex, pivot);
        quicksort(lowIndex,leftPointer-1);
        quicksort(leftPointer+1,highIndex);


    }

    private int getPartitions (int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer= lowIndex;
        int rightPointer= highIndex;

        while(leftPointer<rightPointer){
            while (array[leftPointer]<= pivot &&leftPointer<rightPointer) {

                leftPointer++;
            }
            while (array[rightPointer]>= pivot &&leftPointer<rightPointer) {
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        swap(array,leftPointer, highIndex);
        return leftPointer;
    }

    ;
    private static void swap(int[]array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
