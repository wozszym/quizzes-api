import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long fact = 1;
        long i = 1;

        while (fact <= num) {
            i++;
            fact *= i;
        }

        System.out.println(i);
    }
}