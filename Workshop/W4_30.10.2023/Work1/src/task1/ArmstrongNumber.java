package task1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //getting a number
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        //finding how many digits the entered number has
        int length = String.valueOf(number).length();

        //requirements
        int originalNumber,remainder;
        double result = 0;
        originalNumber = number;

        //armstrong finder
        while(originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder,length);
            originalNumber = originalNumber / 10;
        }

        if (result == number){
            System.out.println(number + " is an Armstrong number");
        }
        else{
            System.out.println(number + " is not an Armstrong number");
        }


    }



}
