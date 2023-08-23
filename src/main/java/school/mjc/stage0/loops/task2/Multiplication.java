package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;

        while (multiplyByAndToInclusive > 0 && counter <= multiplyByAndToInclusive) {
            System.out.println(counter * multiplyByAndToInclusive);
            counter++;
        }

        while (multiplyByAndToInclusive < 0 && counter >= multiplyByAndToInclusive) {
            System.out.println(-counter * multiplyByAndToInclusive);
            counter--;
        }
    }
}
