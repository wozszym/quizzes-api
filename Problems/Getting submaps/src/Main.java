import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here

        var sc = new Scanner(System.in);

        var l = sc.nextInt();
        var h = sc.nextInt();

        var n = sc.nextInt();

        var map = new TreeMap<Integer, String>();

        for (var i = 0; i < n; i++) {
            var key = sc.nextInt();
            var val = sc.next();

            if (key >= l && key <= h) {
                map.put(key, val);
            }
        }

        for (var kvp : map.entrySet()) {
            System.out.println(kvp.getKey() + " " + kvp.getValue());
        }

    }
}