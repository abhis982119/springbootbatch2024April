package org.example.array.basic;

import org.example.helper.ArrayHelper;

import java.util.ArrayList;
import java.util.List;
/*            20 byte
[_ _ 3 _ _ ]

int[] arr = new int[3];
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = new int[5];


        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        int[] newArray = new int[arr.length+1];

        ArrayHelper.copy(newArray, arr); // 0(n)
        newArray[arr.length] = 5;


        ArrayHelper.print(arr);  //0(n)
        System.out.println();
        ArrayHelper.print(newArray);


        List<Integer> list = new ArrayList<>();
        list.add(10);

    }
}
