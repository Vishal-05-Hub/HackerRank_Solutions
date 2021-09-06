// Link to problem-----------------> https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
// Approach used-------------> Using compile method of Pattern class to check if the given regular expression can be compiled for matching or not?
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
      // Using try catch block to output invalid immediately if the code in try blocks gives any expection
          	try{   
                  // If pattern can be compiled Valid be be outputted otherwise code in catch block will be executed
                  Pattern.compile(pattern);
                  System.out.println("Valid");
              } catch(PatternSyntaxException exception){
                  System.out.println("Invalid");
              }
            // Decrementing the testCases value by 1;
            testCases--;
		}
	}
}
