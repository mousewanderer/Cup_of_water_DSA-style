import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.*;

public class DequeCOM {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // 1. add(E e)
        deque.add("First");
        deque.add("Second");

        // 2. addAll(Collection<? extends E> c)
        Collection<String> moreElements = java.util.List.of("Third", "Fourth");
        deque.addAll(moreElements);

        // 3. addFirst(E e)
        deque.addFirst("Zero");

        // 4. addLast(E e)
        deque.addLast("Fifth");

        // 5. contains(Object o)
        System.out.println("Contains 'Third'? " + deque.contains("Third")); // true

        // 6. descendingIterator()
        System.out.println("Elements in reverse order:");
        Iterator x = deque.descendingIterator(); 
         while (x.hasNext()) { 
                System.out.println("Value is : "
                                   + x.next()); 
            } 
        
       

        // 7. element()
        System.out.println("Head of the queue: " + deque.element()); // "Zero"

        // 8. getFirst()
        System.out.println("First element: " + deque.getFirst()); // "Zero"

        // 9. getLast()
        System.out.println("Last element: " + deque.getLast()); // "Fifth"

        // 10. iterator()
        System.out.println("Elements in proper order:");
        Iterator d = deque.iterator(); 
         while (x.hasNext()) { 
                System.out.println("Value is : "
                                   + d.next()); 
            } 


        // 11. offer(E e)
        boolean isAdded = deque.offer("Sixth");
        System.out.println("Offer 'Sixth' successful? " + isAdded); // true

        // 12. offerFirst(E e)
        deque.offerFirst("Negative One");

        // 13. offerLast(E e)
        deque.offerLast("Seventh");

        // 14. peek()
        System.out.println("Peek at head: " + deque.peek()); // "Negative One"

        // 15. peekFirst()
        System.out.println("Peek first: " + deque.peekFirst()); // "Negative One"

        // 16. peekLast()
        System.out.println("Peek last: " + deque.peekLast()); // "Seventh"

        // 17. poll()
        System.out.println("Poll head: " + deque.poll()); // Removes and returns "Negative One"

        // 18. pollFirst()
        System.out.println("Poll first: " + deque.pollFirst()); // Removes and returns "Zero"

        // 19. pollLast()
        System.out.println("Poll last: " + deque.pollLast()); // Removes and returns "Seventh"

        // 20. pop()
        System.out.println("Pop: " + deque.pop()); // Removes and returns the head of the deque

        // 21. push(E e)
        deque.push("New First");

        // 22. remove()
        System.out.println("Remove head: " + deque.remove()); // Removes and returns "New First"

        // 23. remove(Object o)
        deque.remove("Second");

        // 24. removeFirst()
        System.out.println("Remove first: " + deque.removeFirst()); // Removes and returns the first element

        // 25. removeFirstOccurrence(Object o)
        deque.removeFirstOccurrence("Third");

        // 26. removeLast()
        System.out.println("Remove last: " + deque.removeLast()); // Removes and returns the last element

        // 27. removeLastOccurrence(Object o)
        deque.removeLastOccurrence("Fourth");

        // 28. size()
        System.out.println("Size of deque: " + deque.size()); // Returns the total number of elements
    }
}

