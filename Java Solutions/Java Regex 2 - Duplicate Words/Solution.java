// Link to the problem---------------> https://www.hackerrank.com/challenges/duplicate-word/problem
// Approach used------> Used concepts of forming a regular expression.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        
        // In this regular expression regex first this \\b is used to consider the special boundary casess like java and javaReg
        // both contain java so we want to consider java only once but not twice.
        // Here //w+ is used to condider any word character like [a-zA-z0-9]
        // ?: is used to make \\W+(means special characters) a not capturing group and to doest not mean in m.group() method
        // Here \\1 is used to match only which is mathed in the first parantheseis.
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        
        // Pattern.CASE_INSENSITIVE is used as regex is the case sensitive and to overcome this is uded to accept both same upper case and lower case without 
        // throwing error
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                // Replace all with the first group of the match.
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
