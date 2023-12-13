package mocktest;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add elements to the ArrayList
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);

        // Iterate through the list and print each element
        System.out.println("Elements in the ArrayList:");
        for (Integer element : integerList) {
            System.out.println(element);
        }
    }
}

