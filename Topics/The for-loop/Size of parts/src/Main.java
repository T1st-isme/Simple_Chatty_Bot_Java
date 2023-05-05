import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] parts = new int[n];
        for (int i = 0; i < n; i++) {
            parts[i] = scanner.nextInt();
        }
        int ready = 0;
        int fixed = 0;
        int rejects = 0;
        for (int part : parts) {
            if (part == 0) {
                ready++;
            } else if (part == 1) {
                fixed++;
            } else if (part == -1) {
                rejects++;
            }
        }
        System.out.println(ready + " " + fixed + " " + rejects);
    }
}