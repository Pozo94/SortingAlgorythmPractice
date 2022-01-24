package main.Algorithms;

public class Mergesort {
    public int[]array;
    public Mergesort(int[] array){
        this.array=array.clone();

    }
    public int[] mergesort(){
        mergesort(array);
        return array;
    }

    public void mergesort(int[] inputArray){
        int inputLenght=inputArray.length;
        if(inputLenght<2){
            return ;
        }
        int midIndex=inputLenght/2;
        int[]leftHalf=new int[midIndex];
        int[]rightHalf=new int[inputLenght-midIndex];
        System.arraycopy(inputArray, 0, leftHalf, 0, midIndex);
        System.arraycopy(inputArray, midIndex, rightHalf, 0, inputLenght - midIndex);
        mergesort(leftHalf);
        mergesort(rightHalf);
        merge(inputArray,leftHalf,rightHalf);

    }
    public void merge(int[] inputArray,int[] leftHalf,int[] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i=0,j=0,k=0;

        while(i<leftSize && j<rightSize) {

            if(leftHalf[i]<=rightHalf[j]){

                inputArray[k]=leftHalf[i];

                i++;
            }else {

                inputArray[k]=rightHalf[j];

                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;

        }
        while(j<rightSize){
            inputArray[k]=rightHalf[j];
            j++;
            k++;

        }

    }
}
