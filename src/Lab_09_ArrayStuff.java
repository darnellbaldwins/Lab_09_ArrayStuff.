import java.util.Random;
public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }
        System.out.println("First 10 points:");
        for (int i = 0; i < 10; i++) {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }
        System.out.print("Total points in arraay: ");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else {
                System.out.print(dataPoints[i]);
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = sum / (double) dataPoints.length;  // Cast sum to double for floating-point division

        System.out.println("All of the points in the array summed up are: " + sum);
        System.out.println("The average points of the array are: " + average);
    }
}

