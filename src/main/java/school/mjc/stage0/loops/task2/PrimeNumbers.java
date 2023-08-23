package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int j;
        int isPrime;
        while (i <= printToInclusive) {
            j = 1;
            isPrime = 0;
            while (j < i) {
                if (i % j == 0) {
                    isPrime++;
                }
                j++;
            }
            if (isPrime == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(100);
    }
}
