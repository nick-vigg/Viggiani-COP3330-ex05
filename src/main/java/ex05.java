/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        int firstNum = input.nextInt();
        System.out.println("What is the second number?");
        int secondNum = input.nextInt();
        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int multi = firstNum * secondNum;
        int divi = firstNum / secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + add + '\n' +
                            firstNum + " - " + secondNum + " = " + sub + '\n' +
                            firstNum + " * " + secondNum + " = " + multi + '\n' +
                            firstNum + " / " + secondNum + " = " + divi);
    }
}
