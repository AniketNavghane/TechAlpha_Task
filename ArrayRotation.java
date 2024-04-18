public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of elements to rotate
        
        // Calculate the size of the array
        int n = arr.length;
        
        // Create a new array to store the rotated elements
        int[] rotatedArr = new int[n];
        
        // Rotate the array elements
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - d) % n; // Calculate the new index after rotation
            rotatedArr[newIndex] = arr[i]; // Place the element at the new index
        }
        
        // Print the rotated array
        System.out.print("Final Output: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
