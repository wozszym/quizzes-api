import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var text = scanner.next();
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println(text.substring(a,b+1));
    }
}