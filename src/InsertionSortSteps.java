import java.util.Scanner;

public class InsertionSortSteps {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                }
            }

            int key = a[n - 1];
            int i = n - 2;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                printArray(a);
                i--;
            }
            a[i + 1] = key;
            printArray(a);
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i == a.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}
