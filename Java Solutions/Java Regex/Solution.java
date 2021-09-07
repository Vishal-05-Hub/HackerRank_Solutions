// Link to the problem---------------> https://www.hackerrank.com/challenges/java-regex/problem
// Approach used creating a regular expression string and then using it it in pattern method
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    // Creating a regular expression of type string which can conatain number 0-255, so firstly creating a string from 0-199 
    // with help of this "[01]?[0-9]?[0-9]" or from 200-249 with the help of "2[0-4][0-9]" of from 250-255 with the help of 
    // this "25[0-5]".
    String ipAdd = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
    // Then making the string in the form of ip address
    public String pattern = ipAdd + "\\." + ipAdd + "\\." + ipAdd + "\\." + ipAdd;
}
