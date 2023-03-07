import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        // Kann nur Elemente vom Typ String enthalten
        Queue<String> stringQueue = new Queue<>();

        // Kann alle Elemente beinhalten, die vom Typ Object erben.
        NonGenericQueue queue = new NonGenericQueue(); // Object
        queue.enqueue("Hi"); // String

        //                      | Hier casten wir ein Object zu einem String
        String stringAusQueue = (String) queue.getFirst();

        //                      | Ansonsten wuerden wir ein Object bekommen
        Object objectAusQueue = queue.getFirst();
    }
}
