import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = num;

        while (num != 0 && sum < 1000) {
            num = scanner.nextInt();
            sum += num;
        }

        if (sum >= 1000) {
            sum -= 1000;
        }

        System.out.println(sum);
    }
}