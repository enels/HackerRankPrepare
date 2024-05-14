public class PrimeNumbers {

    public void generatePrimeNumbers(int limit) {

        int p, d;
        boolean isPrime;

        for (p = 2; p < limit; p++) {
            isPrime = true;

            // iterate from number 2 to the present test number
            for (d = 2; d < p; d++) {

                // number found that can divide the present test number
                if (p % d == 0) {
                    isPrime = false;
                }
            }
            if (isPrime != false) {
                System.out.print(p + " ");
            }

        }
    }
}