import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        Queue<String> stringQueue = new Queue<>();

        NonGenericQueue queue = new NonGenericQueue(); // Object
        queue.enqueue("Hi"); // String

        String stringAusQueue = (String) queue.getFirst(); // No Strings?
        Object objectAusQueue = queue.getFirst(); // Object by default
    }
}
