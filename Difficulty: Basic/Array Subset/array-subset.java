class Solution {
    public boolean isSubset(int a[], int b[]) {
        // We'll mark used elements in a by setting them to -1 (assuming input >= 0)
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    a[j] = -1; // mark this element as used
                    break;
                }
            }
            if (!found) {
                return false; // element b[i] not found in a
            }
        }
        return true; // all elements found
    }
}
