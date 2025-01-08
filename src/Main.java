import java.util.Arrays;

public class Main {

    private Main() {}

    public static void main(String[] args) {

        int[] numbers = {1, 2}; //TODO: put stuff in the curlies

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            min = Math.min(min, number);
        }

        for (int number : numbers) {
            max = Math.max(max, number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println(average);

    }

}
