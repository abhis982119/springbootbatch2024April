package com.test.demo.autowiredusecasescenario;

public class Runner {


    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();


        BinarySearch binarySearch = new BinarySearch(quickSort);

        int[] arr = new int[]{3,2,1,4};

        binarySearch.search(arr, 2);


        doPreInitActivities();


    }

    private static void doPreInitActivities(){

        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{1,4,2,6};
        ClassRollNumberAssignerHelper rollNumberAssignerHelper = new ClassRollNumberAssignerHelper(bubbleSort);
        rollNumberAssignerHelper.assignRollNubmerToStudents(arr);
    }
}
