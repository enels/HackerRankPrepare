public class GenericArray {
    public static <T> void printArray(T[] input) {
        // iterate through the array
        for (T e: input) {
            System.out.println(e);
        }
    }
}
