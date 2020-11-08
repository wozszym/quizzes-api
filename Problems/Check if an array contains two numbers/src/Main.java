import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var myArr = new int[n];

        for (int i = 0; i < n; i++) {
            myArr[i] = scanner.nextInt();
        }

        var a = scanner.nextInt();
        var b = scanner.nextInt();

        var res = false;

        for (int i = 1; i < n; i++) {
            if (myArr[i] == a && myArr[i-1] == b) {
                // System.out.println("good for " + i);
                res = true;
                break;
            }

            if (myArr[i] == b && myArr[i-1] == a) {
                // System.out.println("good for " + i);
                res = true;
                break;
            }
        }

        // System.out.println(myArr.toString());


        System.out.println(res);
    }
}