import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        String inputFile = "input_numbers.txt";
        String outputFile = "output_results.txt";

        try {
            // Step 1: Create a file with 100 random integers
            writeRandomIntegersToFile(inputFile, 100);

            // Step 2: Read integers from the file
            List<Integer> numbers = readIntegersFromFile(inputFile);

            // Step 3: Sort the integers
            Collections.sort(numbers);

            // Step 4: Calculate sum and product
            long sum = numbers.stream().mapToInt(Integer::intValue).sum();
            long product = numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);

            // Step 5: Write the sorted list, sum, and product to another file
            writeResultsToFile(outputFile, numbers, sum, product);

            System.out.println("File operations completed. Check " + outputFile + " for results.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
     private static void writeRandomIntegersToFile(String fileName, int count) throws IOException {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < count; i++) {
                writer.write(random.nextInt(100) + 1 + "\n"); // Random integers between 1 and 100
            }
        }
    }

    // Method to read integers from a file
    private static List<Integer> readIntegersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }

    // Method to write the sorted list, sum, and product to another file
    private static void writeResultsToFile(String fileName, List<Integer> sortedNumbers, long sum, long product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Sorted List of Integers:\n");
            for (int number : sortedNumbers) {
                writer.write(number + " ");
            }
            writer.write("\nSum of Integers: " + sum + "\n");
            writer.write("Product of Integers: " + product + "\n");
        }
    }

}