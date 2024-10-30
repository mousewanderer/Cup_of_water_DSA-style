import java.util.*;

public class CupWater{
    
    public static void main(String[] args) {
        Boolean filled = true; 
        Boolean chipped = false;
        Boolean Crack = false;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello I am Cup of Water");
        
        // Initialize an array to store shopping list items.
        String[] shoppingList = new String[10];
        int itemCount = 0;
        
        int mL = 10;

        while (true) {
            System.out.println("Hello I am Cup of Water, I act as a List");
            System.out.println("1. Add soemthing ");
            System.out.println("2. Drain it ");
            System.out.println("3. Check if its water supply");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
// Basic features
            switch (choice) {
                case 1:
                    if (itemCount < shoppingList.length) {
                        System.out.print("What to add?: ");
                        String newItem = scanner.next();
                        shoppingList[itemCount] = newItem;
                        itemCount++;
                        System.out.println(newItem + " has been added to the Cup.");
                    } else {
                        System.out.println("The Cup is full. Drain it to add more.");
                    }
                    break;
                case 2:
                    if (itemCount > 0) {
                        System.out.print("Enter the item to remove: ");
                        String itemToRemove = scanner.next();
                        boolean found = false;
                        for (int i = 0; i < itemCount; i++) {
                            if (shoppingList[i].equals(itemToRemove)) {
                                // Shift the items to fill the gap.
                                for (int j = i; j < itemCount - 1; j++) {
                                    shoppingList[j] = shoppingList[j + 1];
                                }
                                shoppingList[itemCount - 1] = null;
                                itemCount--;
                                System.out.println(itemToRemove + " has been removed from the Cup.");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(itemToRemove + " was not found Cup.");
                        }
                    } else {
                        System.out.println("The Cup is empty. Nothing to remove.");
                    }
                    break;
                case 3:
                    System.out.println("Cup: Here is what is inside of me");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println((i + 1) + ". " + shoppingList[i]);
                    }
                    break;
                case 4:
                    System.out.println("Cup: Good bye.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
        
    }
}
