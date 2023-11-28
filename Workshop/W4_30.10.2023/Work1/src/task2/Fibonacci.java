package task2;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {

        BigInteger twoPrevious = BigInteger.valueOf(0);
        BigInteger previous = BigInteger.valueOf(1);

        BigInteger number = previous.add(twoPrevious);

        for (int i = 0; i < 100 ; i++) {
            System.out.println(number);
            number = previous.add(twoPrevious);
            twoPrevious = previous;
            previous = number;

        }


    }
}
