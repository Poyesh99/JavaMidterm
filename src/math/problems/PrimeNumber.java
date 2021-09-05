package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        for (int i = 2; i < 1_000_000; ++i) {
            boolean isPrime = true;
            int sqrt = (int)Math.ceil(Math.sqrt(i));
            for (int divisor = 2; divisor <= sqrt; ++divisor) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }

}
