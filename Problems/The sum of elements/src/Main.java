import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = num;

        while (num != 0) {
            num = scanner.nextInt();
            sum += num;
        }

        System.out.println(sum);
    }
}