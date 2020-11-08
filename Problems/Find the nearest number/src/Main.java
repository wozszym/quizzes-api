import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var list = new ArrayList<Integer>();

        var scanner = new Scanner(System.in);
        var numsString = scanner.nextLine().split(" ");

        for (var x : numsString) {
            list.add(Integer.parseInt(x));
        }

        var target = scanner.nextInt();

        Collections.sort(list);

        var res = new ArrayList<Integer>();

        var bestDist = Integer.MAX_VALUE;

        for (var x : list) {
            if (Math.abs(target - x) < bestDist) {
                bestDist = Math.abs(target - x);
            }
        }

        for (var x : list) {
            if (Math.abs(target - x) == bestDist) {
                res.add(x);
            }
        }

        for (var x : res) {
            System.out.print(x + " ");
        }
    }
}