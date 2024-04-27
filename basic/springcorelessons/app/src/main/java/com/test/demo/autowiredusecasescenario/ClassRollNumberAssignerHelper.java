package com.test.demo.autowiredusecasescenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassRollNumberAssignerHelper {

    @Qualifier("bubblesort")
    @Autowired
    private ISortingAlgo sortingAlgo;

    public ClassRollNumberAssignerHelper(ISortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }

    public void assignRollNubmerToStudents(int[] students){
        sortingAlgo.sort(students);
        System.out.println("Sorted students roll-numbers has been assigned.");
    }
}
