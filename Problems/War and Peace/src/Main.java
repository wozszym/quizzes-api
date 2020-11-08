import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var words = Arrays.stream(sc.nextLine().split(" ")).map(x -> x.toLowerCase()).toArray();

        var table = new HashMap<String, Integer>();

        for (var word : words) {
            String wordStr = (String) word;
            if (table.containsKey(wordStr)) {
                table.replace(wordStr, table.get(wordStr) + 1);
            }
            else {
                table.put(wordStr, 1);
            }
        }

        for (var pair : table.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}