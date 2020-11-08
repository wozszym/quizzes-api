import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var line = scanner.nextLine();
        var arr = Arrays.asList(line.split(" ")).stream().map(x -> Integer.parseInt(x)).toArray();

        var m = scanner.nextInt();

        var n = arr.length;

        m %= n;

        var resArr = new int[n];

        for (int i = 0; i < n; i++) {
            resArr[i] = (int)arr[(i - m + n) % n];
            System.out.print(resArr[i] + " ");
        }

    }
}