import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}