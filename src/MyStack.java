import java.util.*;

class MyStack{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        // create a map of the possible strings
        // where the keys and values represents the
        // open and close signs
        Map <String, String> possibleChars = new HashMap<String, String>();
        possibleChars.put(")", "(");
        possibleChars.put("}", "{");
        possibleChars.put("]", "[");

        String open = "({[";
        String close = "}])";

        boolean balanced = true;
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            String s;
            ArrayList <String> charArray = new ArrayList<String>();

            for (int i = 0; i < input.length(); i++) {
                s = String.valueOf(input.charAt(i));

                if (open.contains(s)){
                    // push into the stack
                    charArray.add(s);
                }
                else if (close.contains(s) && charArray.size() != 0) {
                    // pop out of stack
                    if (charArray.size() == 1 && charArray.contains(s) ) {
                        balanced = false;
                        i = input.length(); // helps to terminate the loop
                    }
                    else {
                        charArray.remove(possibleChars.get(s));
                        balanced = true;
                    }
                }
                else if (close.contains(s) && charArray.size() == 0) {
                    charArray.add(s);
                }
                else{
                    balanced = false;
                }

            }
            if (charArray.size() == 0 && balanced) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }
//
    }
}