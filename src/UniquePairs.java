import java.util.Set;
import java.util.HashSet;
import java.io.*;

public class UniquePairs {

    public void computeUniquePairs() throws IOException{

        // stores the unique pairs
        Set<String> uniquePairs = new HashSet<String>();

        BufferedReader inputPairs = new BufferedReader(new InputStreamReader(System.in));
        int noOfpairs = Integer.parseInt(inputPairs.readLine());

        // stores the total number of unique pairs in each row line so far
        int [] totalNoOfUniquePairs = new int[noOfpairs];

        // counts the number of unique pairs at each stage of input
        int noOfUniquePairs = 0;
        for (int i = 0; i < noOfpairs; i++) {

            // read the inupt lines
            String uniqueStrings = inputPairs.readLine();

            uniquePairs.add(uniqueStrings);

            noOfUniquePairs += uniquePairs.size();

            totalNoOfUniquePairs[i] = noOfUniquePairs;
            noOfUniquePairs = 0;
        }

        for (int i = 0; i < noOfpairs; i++) {
            System.out.println(totalNoOfUniquePairs[i]);
        }
    }
}