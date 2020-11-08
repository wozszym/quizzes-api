import java.util.Scanner;

class Main {

    public static String pretty(String x) {
        var res = "";

        for (var c : x.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                res = res + c;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var ta = scanner.nextLine();
        var tb = scanner.nextLine();

        System.out.println(0 == pretty(ta).compareTo(pretty(tb)));
    }
}