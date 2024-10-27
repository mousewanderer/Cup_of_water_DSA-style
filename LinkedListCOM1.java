import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.*;

public class LinkedListCOM1 {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        //Data accepted
        List<Integer> integerList = new LinkedList<>();       // Integer
        List<Double> doubleList = new LinkedList<>();         // Double
        List<Character> charList = new LinkedList<>();        // Character
        List<Boolean> booleanList = new LinkedList<>();       // Boolean
        List<Long> longList = new LinkedList<>();             // Long
        List<Float> floatList = new LinkedList<>();           // Float
        List<Short> shortList = new LinkedList<>();           // Short
        List<Byte> byteList = new LinkedList<>();             // Byte
        LinkedList<String> list = new LinkedList<>();

        // Adding elements using different methods
        list.add("Apple");                           // add()
        list.addAll(List.of("Banana", "Cherry"));    // addAll()
        list.addFirst("Mango");                      // addFirst()
        list.addLast("Peach");                       // addLast()

        System.out.println("Original List: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst()); // getFirst()
        System.out.println("Last Element: " + list.getLast());   // getLast()
        System.out.println("Element at index 2: " + list.get(2));// get()
        System.out.println("Contains 'Banana': " + list.contains("Banana")); // contains()

        // Using descending iterator
        System.out.print("Reversed List: ");
        list.descendingIterator().forEachRemaining(System.out::print); // descendingIterator()
        System.out.println();

        // Using element(), similar to getFirst()
        System.out.println("First Element (element()): " + list.element()); // element()

        // forEach() to print all elements
        System.out.print("List elements: ");
        list.forEach(e -> System.out.print(e + " "));  // forEach()
        System.out.println();

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry")); // indexOf()
        System.out.println("Last Index of 'Cherry': " + list.lastIndexOf("Cherry")); // lastIndexOf()

        // isEmpty() check
        System.out.println("Is list empty? " + list.isEmpty()); // isEmpty()

        // Iterator and ListIterator
        System.out.print("Using Iterator: ");
        list.iterator().forEachRemaining(e -> System.out.print(e + " "));  // iterator()
        System.out.println();

        System.out.print("Using ListIterator: ");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");  // listIterator()
        }
        System.out.println();

        // Offer methods (add elements at different positions)
        list.offer("Grape");         // offer()
        list.offerFirst("Papaya");   // offerFirst()
        list.offerLast("Strawberry");// offerLast()
        System.out.println("After offers: " + list);

        // Peek methods (retrieve but do not remove)
        System.out.println("Peek first: " + list.peek());       // peek()
        System.out.println("Peek first (peekFirst()): " + list.peekFirst()); // peekFirst()
        System.out.println("Peek last (peekLast()): " + list.peekLast());    // peekLast()

        // Poll methods (retrieve and remove)
        System.out.println("Poll first: " + list.poll());       // poll()
        System.out.println("Poll first (pollFirst()): " + list.pollFirst()); // pollFirst()
        System.out.println("Poll last (pollLast()): " + list.pollLast());    // pollLast()

        System.out.println("After polling: " + list);

        // Pop and Push (treat the list as a stack)
        list.push("Kiwi");  // push (add to beginning)
        System.out.println("After push: " + list);
        System.out.println("Pop: " + list.pop());  // pop (remove first)
        System.out.println("After pop: " + list);

        // Remove methods
        list.remove("Apple");  // remove()
        list.removeFirst();    // removeFirst()
        list.removeLast();     // removeLast()
        System.out.println("After removals: " + list);

        // Remove first and last occurrence
        list.add("Banana");
        list.add("Banana");
        list.removeFirstOccurrence("Banana"); // removeFirstOccurrence()
        list.removeLastOccurrence("Banana");  // removeLastOccurrence()
        System.out.println("After removing first and last occurrence of 'Banana': " + list);

        // RemoveAll and RemoveIf
        list.removeAll(List.of("Cherry", "Grape")); // removeAll()
        list.removeIf(e -> e.startsWith("S"));  // removeIf()
        System.out.println("After removeAll and removeIf: " + list);

        // ReplaceAll
        list.replaceAll(e -> e.toUpperCase());  // replaceAll()
        System.out.println("After replaceAll: " + list);

        // RetainAll
        list.addAll(List.of("APPLE", "ORANGE", "WATERMELON"));
        list.retainAll(List.of("APPLE", "WATERMELON")); // retainAll()
        System.out.println("After retainAll: " + list);

        // Set an element
        list.set(1, "BLUEBERRY");  // set()
        System.out.println("After set: " + list);

        // Size of the list
        System.out.println("Size of the list: " + list.size());  // size()

        // Sort the list
        list.sort(String::compareTo);  // sort()
        System.out.println("After sort: " + list);

        // Spliterator
        System.out.print("Using Spliterator: ");
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::print);  // spliterator()
        System.out.println();

        // SubList
        LinkedList<String> subList = new LinkedList<>(list.subList(0, 2));  // subList()
        System.out.println("SubList: " + subList);

        // Clone the list
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();  // clone()
        System.out.println("Cloned List: " + clonedList);

        // Convert to Array
        Object[] array = list.toArray();  // toArray()
        System.out.print("Array elements: ");
        for (Object o : array) {
            System.out.print(o + " ");
        }

        // Clear the list
        list.clear();  // clear()
        System.out.println("\nList after clear(): " + list);
        
        
        
    }
}
