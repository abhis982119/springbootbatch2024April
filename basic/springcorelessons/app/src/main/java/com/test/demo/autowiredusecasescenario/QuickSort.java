package com.test.demo.autowiredusecasescenario;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSort implements ISortingAlgo{
    @Override
    public void sort(int[] arr) {
        System.out.println("quick sort executed");
    }
}
