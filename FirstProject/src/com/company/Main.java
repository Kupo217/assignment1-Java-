package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task 1:
        // C++,  C#,  java, pascal, php, JavaScript, ActionScript
        String[] lang = {"C++", "C#", "Java", "Pascal", "PHP", "JavaScript", "ActionScript"};
        for (String s : lang) {
            System.out.println(s);
        }


//        // Task 2
        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[2];
//        for (int i = 0; i < 2; i++){
//            System.out.print("Enter a number: ");
//            int num = sc.nextInt();
//            if (num == 0){
//                System.out.println("Cannot insert 0");
//            }else{
//                nums[i] = num;
//            }
//        }
//        System.out.println(nums[0] / nums[1]);
//        System.out.println(nums[1] % nums[0]);
//
//        // Task 3
//        int[] numSum = new int[3];
//        for (int i = 0; i < numSum.length; i++) {
//            System.out.print("Enter a number: ");
//            int num = sc.nextInt();
//            numSum[i] = num;
//        }
//        System.out.println("The sum of entered nums: ");
//        System.out.println(Arrays.stream(numSum).sum());
//
//        System.out.println("The multiplication of nums: ");
//        System.out.println(numSum[0] * numSum[1] * numSum[2]);


        // Task 4
        int test = 123;
        String myNum = String.valueOf(test);
        for (int i = 0; i < myNum.length(); i++) {
            char index = myNum.charAt(i);
            System.out.println(index);
        }


        // Task 5
        int sum = 0, digit = 0;
        int number = 3251;
        while(number > 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of digits: ");
        System.out.println(sum);

        // Task 6
        int sum1 = 0;
        int digit1 = 0;
        System.out.println("Enter any integer: ");
        int userNum = sc.nextInt();

        while (userNum > 0){
            digit1 = userNum % 10;
            sum1 += digit1;
            userNum /= 10;
        }
        System.out.println("The sum of digits (user input): ");
        System.out.println(sum1);


    }
}
