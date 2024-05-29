public class Solution {
    // Method to add one to the binary string
    public void addOne(StringBuilder s) {
        int i = s.length() - 1;

        // Traverse the string from the end to find the first '0'
        while (i >= 0 && s.charAt(i) != '0') {
            s.setCharAt(i, '0'); // Change '1' to '0'
            i--;
        }

        // If all bits are '1', prepend '1' to the string
        if (i < 0) {
            s.insert(0, '1');
        } else {
            s.setCharAt(i, '1'); // Change the first '0' to '1'
        }
    }

    // Method to count the number of steps to reduce the binary string to '1'
    public int numSteps(String s) {
        int op = 0;
        StringBuilder sb = new StringBuilder(s); // Use StringBuilder for mutable string operations

        // Continue until the length of the string is greater than 1
        while (sb.length() > 1) {
            int n = sb.length();

            // If the last character is '0', remove it (divide by 2)
            if (sb.charAt(n - 1) == '0') {
                sb.deleteCharAt(n - 1);
            } else {
                addOne(sb); // Otherwise, add one to the string (binary addition)
            }

            op++; // Increment the operation count
        }

        return op; // Return the total number of operations
    }
}
