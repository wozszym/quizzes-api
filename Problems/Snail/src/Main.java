import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h,a,b;
        h = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        int res = 0;
        int pos = 0;

        while(true) {
            res += 1;
            pos += a;

            if (pos >= h) {
                break;
            } else {
                pos -= b;
            }
        }

        System.out.println(res);
    }
}