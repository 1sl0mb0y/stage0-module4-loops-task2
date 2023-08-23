package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        if (power >= 0) {
            System.out.println(1);
        } else {
            System.out.println("too much power");
        }

        while (i < power) {
            int j = 0;
            int k = 1;
            while (j <= i) {
                k*=2;
                j ++;
            }
            System.out.println(k);
            i++;
        }
    }
}
