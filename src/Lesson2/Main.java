package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        arrayInvecter();
        System.out.println(" Первое задание");
        arrayEmpty();
        System.out.println(" Второе задание");
        arrayMultiply();
        System.out.println(" Третье задание");
        arraySquare();
        System.out.println(" Четвёртое задание");
        arrayMinMax();
        System.out.println(" Пятое задание");
    }
    //    1 задание
    public static void arrayInvecter() {
        int i = 0;
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else arr[i] = 1;
            System.out.print(arr[i]);
        }
    }
    //    2 задание
    public static void arrayEmpty() {
        int [] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++,  j = j + 3) {
            arr[i] = j;
            System.out.print(arr[i]);
        }
    }
    //    3 задание
    public static void arrayMultiply() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 6) {
                arr[i] = arr[i]*2;
            }
            System.out.print(arr[i]);
        }
    }
    //    4 задание
    public static void arraySquare() {
        int count = 1;
        int[][] arr = new int [8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = count;
                }
                System.out.print(arr[i][j] +" ");
                count++;
            }
            System.out.println();
        }
    }
    //    5 задание
    public static void arrayMinMax() {
        int [] arr = {42, 16, 15, 23, 4};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("min = " +arr[0] + " max = " + arr[arr.length - 1] );
    }
}