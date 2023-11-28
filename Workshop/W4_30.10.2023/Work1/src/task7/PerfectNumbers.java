package task7;

import java.math.BigInteger;

public class PerfectNumbers {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        BigInteger[] perfectNumbers = new BigInteger[10];
        //finding 10 perfect numbers
        while (count < 10) {
            BigInteger number = BigInteger.valueOf(2).pow(n - 1);
            BigInteger isPrime = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);

            if (isPrime.isProbablePrime(1)) { // Asal sayı kontrolü için isProbablePrime kullanılır
                BigInteger perfectNumber = number.multiply(isPrime);// number*isPrime
                perfectNumbers[count] = perfectNumber;
                count++;
            }

            n++;
        }

        // Sonuçları göster
        for (BigInteger number : perfectNumbers) {
            System.out.println(number);
        }

    }
}
