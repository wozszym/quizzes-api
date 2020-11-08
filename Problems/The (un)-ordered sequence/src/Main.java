import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var num = scanner.nextInt();
        var isAsc = true;
        var isDesc = true;
        var prev = num;

        while (num != 0) {

            if (num > prev)
                isDesc = false;

            if (num < prev)
                isAsc = false;

            prev = num;

            num = scanner.nextInt();
        }

        System.out.println(isAsc || isDesc);
    }
}