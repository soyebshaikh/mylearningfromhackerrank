/* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/




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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
 int n=arr.size();
      //here we converted the interger to the long
    long[] myList = new long[n];
      //for loop to cast all the value
    for(int i=0;i<n;i++){
    myList[i] = (long)arr.get(i);
    }
      //use this loop for the sorting the List
    for(int p=0;p<=n-1;p++){
        for(int q=p+1;q<=n-1;q++){
            long temp=0;
            if(myList[p]>myList[q]){
                temp=myList[p];
                myList[p]=myList[q];
                myList[q]=temp;
            }
        }
    }
      //After the sorting just adding all the array value in the sum 
    long sum=0;
    for(int i=0;i<=n-1;i++){
        sum+=myList[i];
    }
      //here is the fun fact that if you take out the frist number its the max and if you take out the n-1 its the min simple it take me a whole day.
    long h=sum-myList[0];
    long l=sum-myList[n-1];
    System.out.println(l+" "+h);
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
