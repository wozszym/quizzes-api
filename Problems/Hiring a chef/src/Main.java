import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var firstName = scanner.next();

        for (var i = 0; i < 3; i++)
            scanner.next();

        var cpref = scanner.next();

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cpref + " dishes.");
    }
}