import java.util.SortedSet;

public class TreeSet {
    public static void main(String[] args) {
        SortedSet<String> fruits = new java.util.TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
            System.out.println("Fruits Set: " + fruits);
        fruits.add("Apple");
            System.out.println("After adding duplicate elements \"Apple\":" +fruits);
        fruits.add("Banana");
            System.out.println("After adding \"Banana\":" +fruits);
    }
}
