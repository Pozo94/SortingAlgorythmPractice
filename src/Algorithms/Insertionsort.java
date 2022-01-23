package Algorithms;

public class Insertionsort {
    int[] array;
    public Insertionsort(int[] array){
        this.array=array.clone();
    }
    public int[] insertionsort(){
        for(int i=0;i<array.length;i++){
            int currentValue=array[i];
            int j=i-1;
            while (j>=0&&array[j]>currentValue){
            array[j+1]=array[j];
            j--;
            }
            array[j+1]=currentValue;

        }
        return array;
    }
}
