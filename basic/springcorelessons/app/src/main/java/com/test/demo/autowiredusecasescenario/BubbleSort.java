package com.test.demo.autowiredusecasescenario;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements ISortingAlgo{
    @Override
    public void sort(int[] arr) {
        System.out.println("bubble sort executed");
    }
}
