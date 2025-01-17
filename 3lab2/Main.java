import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        SortContext sortContext = new SortContext(new BubbleSort());
        boolean cont = true;

        while (cont) {
            System.out.println();
            System.out.println("Choose a sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sortContext.setSortingStrategy(new BubbleSort());
                    break;
                case 2: sortContext.setSortingStrategy(new QuickSort());
                    break;
                case 3:
                    sortContext.setSortingStrategy(new MergeSort());
                    break;
                default: {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            sortContext.performSort(array);
            System.out.println("Sorted array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println();

            System.out.print("Would you like to try a different sorting algorithm on the same list? (y/n): ");
            cont = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("Program completed.");
        scanner.close();
    }
}
