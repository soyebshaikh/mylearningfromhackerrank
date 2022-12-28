/* Given a time in 12 -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

Example*/






import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
     // Write your code here
        String rtnStr = "";
        String theFirstTwoDigit = s.substring(0, 2);
        if (s.indexOf("A") >= 1) {            
            if ("12".equals(theFirstTwoDigit) ) {
                rtnStr = "00" + s.substring(2, s.length() - 2);
            }else {
                rtnStr = s.substring(0, s.length() - 2);
            }
        }else if (s.indexOf("P") >= 1) {
            if ("12".equals(theFirstTwoDigit) ) {
                rtnStr = s.substring(0, s.length() - 2);
            }else {
                Integer theFirstTwoDigitInt 
                  = Integer.parseInt(theFirstTwoDigit) + 12;
                rtnStr = theFirstTwoDigitInt 
                           + s.substring(2, s.length() - 2);
            }
        }else {}
        return rtnStr;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
