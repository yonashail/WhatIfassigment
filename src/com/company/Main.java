package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Defining num1,num2,product,sum,average
        int num1, num2;
        int product;
        int average;
        int sum;
//prompt the user to input num1 and num2
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum=num1+num2;
        //if the sum is greater than 200, put asterisk after the sum
        if (sum>200){
            System.out.println("Sum : " +sum+"#");}
            else{
                System.out.println("Sum : "+sum);}

        product=num1*num2;
        average=((num1+num2)/2);
        System.out.println("Average : " +average+"\nProduct : "+product);

    }
}
