import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        while (!x.equals("0")) {
            try {
                int num = Integer.parseInt(x);
                System.out.println(num * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + x);
            }
            x = scanner.nextLine();
        }

    }
}