public class subStringLexicoOrder {
    public static void main(String[] args) {
        String x = "welcometojava";
        int b = 3;
        System.out.println(getSmallestToLargest(x, b));
    }

    public static String getSmallestToLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;
        String [] strArr = new String [s.length()];

        String result = "";

        String curr = ""; // Initialize curr outside the loop
        int index = 0;
        for (int i = 1; i <= s.length() - k; i++) { // Loop starts from 1
            curr = s.substring(i, i + k);

            if (smallest.compareTo(curr) > 0) {
                smallest = curr;
            }
            if (largest.compareTo(curr) < 0) {
                largest = curr;
            }

            result += curr + "\n";
            strArr[index] = curr;
            index++;
        }

        //sort the array using selection sort
        String temp = "";
        for (int i = 0; i < index - 1; i++) {

            for (int j = i; j < index; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }

        // store the sorted result in the array as a string
        result = "";
        for (int i = 0; i < index; i++) {
            result += strArr[i];
            result += "\n";
        }

        return result;
    }
}