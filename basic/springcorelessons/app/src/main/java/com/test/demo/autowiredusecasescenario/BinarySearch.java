package com.test.demo.autowiredusecasescenario;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {


    private ISortingAlgo sortingAlgo;



    public BinarySearch(ISortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }

    public void search(int[] arr, int valueToBeSearched){
        sortingAlgo.sort(arr);
        binarySearch(arr, valueToBeSearched);
    }

    private void binarySearch(int[] arr, int valueToBeSearched){
        System.out.println("binary search started");
    }
}
