import java.util.*;

public class MyDeque {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        //System.out.println(n + " : " + m);

        for (int i = 1; i < n; i++) {
            int num = in.nextInt();
            if (i < m)
                deque.addFirst(num);
            else if (deque.contains(num)) {
                deque.removeLast();
                deque.addFirst(num);
            }
            else {
                deque.addFirst(num);
            }
        }

        System.out.println(deque.size());


    }

}