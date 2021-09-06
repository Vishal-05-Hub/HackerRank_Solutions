// Link to the problem------------------> https://www.hackerrank.com/challenges/java-string-tokens/problem
// Approach used ----> Using concept of passing a regular expression as a argument in split() method of string.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // First trim the string as it deletes the leading and trailing spaces of a string and check if the length of string is equal to 0 
        // or greater than the given constraints in the question print 0 and return
        if(s.trim().length() == 0 || s.trim().length() > 400000){
            System.out.println(0);
            return;
        }
        
        // Maintain a string array that holds all string seperated according to argument in the split() method.
        String[] s1 = s.trim().split("[ !,?.\\_'@]+");
        int size = s1.length;
        System.out.println(size);
        // Simplyy prints all the string using for each loop.
        for(String s2 : s1){
            System.out.println(s2);
        }
        scan.close();
    }
}
