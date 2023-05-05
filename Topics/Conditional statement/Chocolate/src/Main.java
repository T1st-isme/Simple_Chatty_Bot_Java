import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int k = scanner.nextInt();
        if ((k % length == 0 && k / length < width) || (k % width == 0 && k / width < length)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}