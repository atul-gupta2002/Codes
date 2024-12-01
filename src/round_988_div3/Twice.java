package round_988_div3;

import java.util.HashMap;
import java.util.*;

public class Twice {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Read the number of test cases
                int t = scanner.nextInt();
                int[] results = new int[t];

                for (int testCase = 0; testCase < t; testCase++) {
                    // Read the size of the array
                    int n = scanner.nextInt();

                    // Read the array elements
                    int[] a = new int[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = scanner.nextInt();
                    }

                    // Calculate the maximum score
                    results[testCase] = calculateMaxScore(a);
                }

                // Output the results for all test cases
                for (int result : results) {
                    System.out.println(result);
                }

                scanner.close();
    }

            private static int calculateMaxScore(int[] a) {
                Map<Integer, Integer> frequencyMap = new HashMap<>();

                // Count the frequency of each element
                for (int num : a) {
                    frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                }

                int score = 0;

                // Calculate pairs from frequency
                for (int freq : frequencyMap.values()) {
                    score += freq / 2;
                }

                return score;
            }
}



