package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int j;
        int factorial;
        System.out.println(1);
        while (i <= printToInclusive) {
            j = 1;
            factorial = 1;
            while (j <= i) {
                factorial *= j;
                j++;
            }
            System.out.println(factorial);
            i++;
        }
    }
}
