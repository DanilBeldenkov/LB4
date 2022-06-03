package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array :");

        int size = input.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the array elements :");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int minvalue=array[0];

        for (int i=1;i<array.length;i++){
            if (array[i]<minvalue){
                minvalue=array[i];
            }
        }

        double average = 0;

        if (array.length > 0)
        {
            double summa = 0;
            for (int j = 0; j < array.length; j++) {
                summa += array[j];
            }
            average = summa / array.length;
        }

        double sum=minvalue+average;

        System.out.println("Minimum element:"+ minvalue);
        System.out.println("Arithmetic mean:"+average);
        System.out.println("The sum of the minimum element and the arithmetic mean:"+sum);
    }
}