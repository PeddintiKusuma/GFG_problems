import java.util.ArrayList;

class Solution {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();

        float exact = a / b;
        result.add(exact);  // Exact result

        // Round to 3 decimal places
        String formatted = String.format("%.3f", exact);
        float rounded = Float.parseFloat(formatted);
        result.add(rounded);  // Rounded result

        return result;
    }
}