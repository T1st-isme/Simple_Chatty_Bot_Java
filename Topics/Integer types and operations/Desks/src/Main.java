import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//
//        int g1 = Integer.parseInt(scanner.nextLine());
//        int g2 = Integer.parseInt(scanner.nextLine());
//        int g3 = Integer.parseInt(scanner.nextLine());
//
//        int rs = g1 / 2 + g1 % 2 + g2 / 2 + g2 % 2 + g3 / 2 + g3 % 2;
//
//        System.out.println(rs);
        int a = 4;
        int b = a++;
        int c = --a + b++;
        int result = ++a - (c++ - b) + c;
        System.out.println(result);



    }
}