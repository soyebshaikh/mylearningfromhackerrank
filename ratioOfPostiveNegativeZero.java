/* 
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    List<Integer> answer = new ArrayList<>();
    public static void plusMinus(List<Integer> arr) {
        double a=0;
        double b=0;
        double c=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                a++;
            
            }else if(arr.get(i)<0){
                b++;
                
            }else{
                c++;
            }
        }
        a=a/arr.size();
        b=b/arr.size();
        c=c/arr.size();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
        
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
