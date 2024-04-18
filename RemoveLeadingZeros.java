public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String input = "00000123789";
        
        // Remove leading zeros using String manipulation
        String output = removeLeadingZeros(input);
        
        // Print the output after removing leading zeros
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    
    // Method to remove leading zeros from a string
    public static String removeLeadingZeros(String str) {
        // Find the index of the first non-zero character
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        
        // Extract the substring starting from the first non-zero character
        String result = str.substring(i);
        
        // If the resulting string is empty, return "0"
        // Otherwise, return the trimmed string
        return result.isEmpty() ? "0" : result;
    }
}
