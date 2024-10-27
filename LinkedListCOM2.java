import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

public class LinkedListCOM2 {
    public static void main(String[] args) {
        //Data types for list

        // Strings
        List<String> stringList = new LinkedList<>();         // String

        // Complex types
        List<List<Integer>> listOfLists = new LinkedList<>(); // List of lists
        List<int[]> arrayList = new LinkedList<>();           // List of arrays

        //__________________________________________________________________________________________________________________________________
        
        List<Object> mixedList = new LinkedList<>();
        mixedList.add("Hello");
        mixedList.add(123);  // Integer
        mixedList.add(3.14); // Double
        
        //
        // Create a LinkedList
        List<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Insert element at a specific index
        list.add(1, "Orange");

        // Add a collection of elements to the list
        List<String> moreFruits = new LinkedList<>();
        moreFruits.add("Mango");
        moreFruits.add("Pineapple");
        list.addAll(moreFruits);

        // Add all elements at a specific index
        List<String> additionalFruits = new LinkedList<>();
        additionalFruits.add("Grapes");
        additionalFruits.add("Peach");
        list.addAll(2, additionalFruits);

        // Get element by index
        String firstFruit = list.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Check if list contains a specific element
        boolean containsApple = list.contains("Apple");
        System.out.println("List contains Apple: " + containsApple);

        // Get the index of an element
        int indexOfBanana = list.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        // Remove an element by index
        String removedElement = list.remove(2);
        System.out.println("Removed element: " + removedElement);

        // Replace an element at a specific index
        list.set(1, "Strawberry");
        System.out.println("List after replacement: " + list);

        // Check if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Get size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Clear the list
        list.clear();
        System.out.println("List cleared. Size: " + list.size());

        // Add elements back to demonstrate more methods
        list.add("Kiwi");
        list.add("Dragonfruit");
        list.add("Pomegranate");

        // Use an iterator to loop through the list
        Iterator<String> iterator = list.iterator();
        System.out.println("List items:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Sort the list using a custom comparator
        list.sort((fruit1, fruit2) -> fruit1.compareTo(fruit2));
        System.out.println("Sorted list: " + list);

        // Convert the list to an array
        String[] fruitArray = list.toArray(new String[0]);
        System.out.println("Array of fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
        
        //---------------------------------------------------------------------------------------------------------------------------
        
    }
}
