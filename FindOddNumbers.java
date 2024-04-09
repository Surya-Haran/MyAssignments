package homeAssignment;

public class FindOddNumbers {
    public static void main(String[] args) {
        int maxRange = 10;

        System.out.println("Odd numbers from 1 to " + maxRange + ":");
        for (int i = 1; i <= maxRange; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}