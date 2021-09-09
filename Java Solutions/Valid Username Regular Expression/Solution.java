// Link to the priblem-------------> https://www.hackerrank.com/challenges/valid-username-checker/problem
// Approach used------> Using the concepts of forming a regular expression

import java.util.Scanner;
class UsernameValidator {
    
    // Here the main part is to form this regeular expression whic while trace all the valid username of any length from 8 to 30
    // and first letter is only can be a-z or A-Z and after that any alphanumeric chracter including underscores .
    // So ^[a-zA-Z] is uded and here ^ anchor shows that this is the only beginning to the username and
    // here \\w{7,29}$ used to read any apphanumeric of any length from 8 to 30 including the first string in {7,29} boundary and $ shows the end of the string 
    // and define the contrains to the length of the user name and restricts the length to 8-30 characters only
    static String regex = "^[a-zA-Z]\\w{7,29}$";
    public static final String regularExpression = regex;
}


// This code is already given
public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
