package Algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingMethodsTests {
    int[]array={99999,2,5,500,6,123456,4,8,999,9,1,3,7,0,100,10000};
    int[]expArray={0,1,2,3,4,5,6,7,8,9,100,500,999,10000,99999,123456};
    @Test
    void bubblesortArray(){
        var bubblesort=new Bubblesort(array);
        assertArrayEquals(expArray,bubblesort.bubblesort());
    }
    @Test
    void insertionSortArray(){
        var insertionsort=new Insertionsort(array);
        assertArrayEquals(expArray,insertionsort.insertionsort());
    }
    @Test
    void mergeSortArray(){
        var mergesort=new Mergesort(array);
        assertArrayEquals(expArray,mergesort.mergesort());
    }
    @Test
    void quickSortArray(){
        var quicksort=new Quicksort(array);
        assertArrayEquals(expArray,quicksort.quicksort());
    }
}