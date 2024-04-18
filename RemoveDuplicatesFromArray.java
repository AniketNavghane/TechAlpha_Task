import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};

        // LinkedHashSet preserves the insertion order while removing duplicates
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        
        // Add all elements of the array to the LinkedHashSet
        for (int num : inputArray) {
            uniqueElements.add(num);
        }
        
        // Convert the Set back to an array
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }
        
        // Print the result array
        System.out.print("[ ");
        for (int i = 0; i < resultArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(resultArray[i]);
        }
        System.out.println(" ]");
    }
}
