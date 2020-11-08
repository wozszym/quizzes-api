import java.util.*;

class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<String>();

        for (var i = 0; i < 8; i++)
        {
            myList.add(scanner.next());
        }

        Collections.reverse(myList);

        for (var i = 0; i < 8; i++)
        {
            System.out.println(myList.get(i));
        }
    }
}