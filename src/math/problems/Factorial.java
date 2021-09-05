package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {


    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
        int num = 5;
        long factorial = recursiveFactorial(num);
        System.out.println("Factorial of" + " " + num + " " + "=" + " " + factorial);
    }

    public static long recursiveFactorial(int num) {
        if (num >= 1)
            return num * recursiveFactorial(num - 1);
        else
            return 1;
    }

    public int iterativeFactorial(int num) {
        int sum = 1;
        for (int i = 1; i <= num ; i++)
        {
            sum = sum * i;

        }
        return sum;
    }
}




