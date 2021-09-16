// Link to the problem------------> https://www.hackerrank.com/challenges/java-negative-subarray/problem
// Approach used------------------> Using Scanner class for taking th input and nested for loop for getting the sum of the subarray

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // Scanner class is used to get the inputs from from the user
        Scanner in = new Scanner(System.in);
        
        // Taking the size of from array from input
        int n = in.nextInt();
        // Creating a array of sie n
        int[] arr = new int[n];
        
        // Getting the input from the user to get the array filled
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        // Taking initial count 0
        int count = 0;
        // Run a for loop from i=0 till the length of the array
        for(int i=0; i < n; i++){
            int sum = 0;
            // Running a nested for loop from int j=i to array length
            for(int j=i; j < n; j++){
                // Getting out sum from j to n sub array wise
                sum += arr[j];
                // If the sum is less than zero then increase the count
                if(sum < 0){
                    count++;
                }
            }
        }
        
        // Finally printout the value of count
        System.out.println(count);
        
    }
}
