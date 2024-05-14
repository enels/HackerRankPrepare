public class MilitaryTime {

    // normal time
    private String normalTime;

    // military time to store the final answer
    private String militaryTime;
    public MilitaryTime(String normalTime) {

        // collect normal time
        this.normalTime = normalTime;
        this.militaryTime = "";
    }
    public String convertToMilitaryTime() {

        // collect the 2nd to the last character
        char periodChar = this.normalTime.charAt(this.normalTime.length() - 2);

        String firstTwoChars = "";

        // index to begin concatenating the final military time string
        int index = 0;

        // if it's afternoon or evening
        if (periodChar == 'P') {

            // collects the first 2 integer characters

            // collects the first character if it's not a zero
            if ( normalTime.charAt(0) != '0')
                firstTwoChars += normalTime.charAt(0);

            // collects 2nd character
            firstTwoChars += normalTime.charAt(1);

            // convert the first two integer characters to integers
            int hour = Integer.parseInt(firstTwoChars);

            if ( hour != 12 ) {
                // add 12 to make it a 24 hour military time
                hour += 12;
            }
            else {
                // 12pm noon
                hour = 0;
            }

            // build the new result string
            if ( hour == 0 ) {
                this.militaryTime += "00";
            }
            else {
                int temp = hour % 10;

                this.militaryTime += hour / 10;
                this.militaryTime += temp;
            }

            // initialize the index to begin concatenating the final military time string
            index = 2;
        }
        else if( periodChar == 'A') {

            // checks 2nd character
            if (normalTime.charAt(1) == '2') {
                // it's 12am in the morning
                this.militaryTime += "00";

                // set the index to start collecting the characters of the normal time
                // in order to concatenate it to the military time
                index = 2;
            }

        }
        // concatenate the rest of the normal time string to the
        // new time in military format
        // starting from the third character
        for ( ; index < normalTime.length()-2; index++) {
            this.militaryTime += normalTime.charAt(index);
        }

        return this.militaryTime;
    }
}
