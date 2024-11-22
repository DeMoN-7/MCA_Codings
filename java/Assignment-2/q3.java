import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class q3 {
    private static final String INPUT_FILE = "input_numbers.txt";
    private static final String OUTPUT_FILE = "output_results.txt";
    private static List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
    private static long sum = 0;
    private static long product = 1;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        try {
            // Step 1: Write random integers to a file (Thread 1)
            executor.submit(() -> {
                try {
                    writeRandomIntegersToFile(INPUT_FILE, 100);
                } catch (IOException e) {
                    System.err.println("Error writing to input file: " + e.getMessage());
                }
            }).get();

            // Step 2: Read integers from the file (Thread 2)
            executor.submit(() -> {
                try {
                    numbers.addAll(readIntegersFromFile(INPUT_FILE));
                } catch (IOException e) {
                    System.err.println("Error reading from input file: " + e.getMessage());
                }
            }).get();

            // Step 3: Sort the integers (Thread 3)
            executor.submit(() -> {
                Collections.sort(numbers);
            }).get();

            // Step 4: Calculate the sum (Thread 4) and product (Thread 5)
            Future<Long> sumFuture = executor.submit(() -> {
                return numbers.stream().mapToLong(Integer::intValue).sum();
            });

            Future<Long> productFuture = executor.submit(() -> {
                return numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
            });

            sum = sumFuture.get();
            product = productFuture.get();

            // Step 5: Write results to another file (Thread 6)
            executor.submit(() -> {
                try {
                    writeResultsToFile(OUTPUT_FILE, numbers, sum, product);
                } catch (IOException e) {
                    System.err.println("Error writing to output file: " + e.getMessage());
                }
            }).get();

            System.out.println("Multi-threaded file operations completed. Check " + OUTPUT_FILE + " for results.");
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }

    // Method to generate a file with random integers
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
                writer.write(number + "\n");
            }
            writer.write("\nSum of Integers: " + sum + "\n");
            writer.write("Product of Integers: " + product + "\n");
        }
    }
}
