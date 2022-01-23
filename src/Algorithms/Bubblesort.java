package Algorithms;

public class Bubblesort {
    int[] array;

    public Bubblesort(int[] array) {
        this.array=array.clone();
    }

    public int[] bubblesort(){
        int tmp;
        boolean isSwaped=true;
        while (isSwaped){
        isSwaped=false;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSwaped=true;
                tmp=array[i];
                array[i]=array[i+1];
                array[i+1]=tmp;

            }
        }
        }
        return array;
    }
}
