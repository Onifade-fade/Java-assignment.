// 3
import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        // Given array
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int n = array.length;
        if (n % 2 == 0) {
            // If even, take the average of the two middle numbers
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            // If odd, take the middle number
            return array[n / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDiffs = 0;
        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / array.length); // Standard deviation formula
    }
}