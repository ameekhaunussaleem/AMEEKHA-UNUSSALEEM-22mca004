import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nName:Ameekha unussaleem");
System.out.println("Reg No:SJC22MCA-2004");
System.out.println("Course_Name:OOPS Lab");
System.out.println("Course_Code:22MCA132");
System.out.println("Date:27-06-23");
System.out.println("\n.........................\n");
        System.out.print("Enter the number of strings to add: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringList.add(input);
        }
        System.out.println("Original list: " + stringList);
        int size = stringList.size();
        System.out.println("Size of the list: " + size);
        boolean isEmpty = stringList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
        String firstElement = stringList.get(0);
        String lastElement = stringList.get(size - 1);
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        Collections.sort(stringList);
        System.out.println("List after sorting in ascending order: " + stringList);
        System.out.print("Enter a string to check if it exists in the list: ");
        String searchString = scanner.nextLine();
        boolean containsString = stringList.contains(searchString);
        System.out.println("Does the list contain '" + searchString + "'? " + containsString);
        System.out.print("Enter a string to remove from the list: ");
        String removeString = scanner.nextLine();
        boolean removed = stringList.remove(removeString);
        System.out.println("Element '" + removeString + "' removed? " + removed);
        System.out.println("List after removing an element: " + stringList);
        stringList.clear();
        System.out.println("List after clearing all elements: " + stringList);

        scanner.close();
    }
}
