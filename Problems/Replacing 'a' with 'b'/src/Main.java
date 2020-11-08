import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var text = scanner.next();

        System.out.println(text.replace('a', 'b'));
    }
}