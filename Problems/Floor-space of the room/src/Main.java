import java.util.Scanner;

class Main {

    private static double trArea(double sideA, double sideB, double sideC)
    {
        double area; double s;
        s = 0.5 * (sideA + sideB + sideC);
        area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        switch (x) {
            case "triangle":
                double a, b, c;
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                System.out.println(trArea(a,b,c));
                break;
            case "rectangle":
                int aa, bb;
                aa = sc.nextInt();
                bb = sc.nextInt();

                System.out.println(aa*bb);
                break;
            case "circle":
                double aaa = sc.nextDouble();
                System.out.println(aaa*aaa*3.14);
                break;
            default:
                System.out.println();

        }

    }
}