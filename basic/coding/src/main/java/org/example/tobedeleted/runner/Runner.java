package org.example.tobedeleted.runner;

import org.example.tobedeleted.model.Student;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Student student = new Student();

        System.out.println("Thread running : " + Thread.currentThread().getName());
        CompletableFuture.runAsync(() -> System.out.println("Hello " + Thread.currentThread().getName()) );
        CompletableFuture.runAsync(() -> System.out.println("Hello " + Thread.currentThread().getName()) );
        Thread.sleep(3000);

    }

}

/*
       [ 1 2 3 4 5 ]

 */


