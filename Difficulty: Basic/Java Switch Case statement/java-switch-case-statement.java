// User function Template for Java
import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1: {
                // Circle area: πr²
                double radius = arr.get(0);
                return Math.PI * radius * radius;
            }
            case 2: {
                // Rectangle area: l × b
                double length = arr.get(0);
                double breadth = arr.get(1);
                return length * breadth;
            }
            default:
                // If invalid choice
                return -1.0;
        }
    }
}
