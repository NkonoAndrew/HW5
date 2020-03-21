package com.sjsu;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class DataSet {
    public static double[] arr;

    //sets the maximum size of the array
    public DataSet(int maximumNumberOfValues) {
        arr = new double[maximumNumberOfValues];
    }

    public static void sizeOfDataSet(double[] array){
            int counter = 0;
            for(Object el: array) {
                if(el != null)
                    counter++;
            }
        System.out.println("There are " + counter + " elements!");
    }

    DataSet(){

    }
    public static double[] add(){

        Scanner input = new Scanner(System.in);
        //display initial array and its size
        System.out.println("The initial array is:" + Arrays.toString(arr)
                + " with array size " + arr.length);

        System.out.println("Add elements to the array");

        //create a new array, for adding one element at the end
       /// double[] newarray = new double[n + 1];

        //insert all elements of old array into new array
        //add x to the last position

        for (int i = 0; i < arr.length ; i++) {
            //newarray[i] = arr[i];
            //newarray[n] = arrayInput;
            arr[i] = input.nextDouble();
        }
        return arr;

    }


    public static void sum(double[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("sum of array values : " + sum);
    }

    public static void average(int n){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }

        int average = sum / n;
        System.out.println("The average is:" + average);

    }
    public static void minimum(double[] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum is:" + min );
    }

    public static void maximum(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum is:" + max );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an array with a maximum number size, n
        System.out.print("Set the maximum size of the array:");
        int sizeOfArray = input.nextInt();
        new DataSet(sizeOfArray);

        //display the size of the array
        System.out.println("The set size is:" + arr.length);

        //call function that add elements to array
        arr = add();
        System.out.println("With added elements:" + Arrays.toString(arr));
        System.out.println("Number of elements in array:" + arr.length / (Integer.BYTES));


        // passing array to methods;
        sum(arr);
        average(arr.length);
        sizeOfDataSet(arr);
        minimum(arr);
        maximum(arr);

    }



}





