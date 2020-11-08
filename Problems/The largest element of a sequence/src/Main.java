import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int max = num;

        while (num != 0) {
            num = scanner.nextInt();
            max = num > max ? num : max;
        }

        System.out.println(max);
    }
}