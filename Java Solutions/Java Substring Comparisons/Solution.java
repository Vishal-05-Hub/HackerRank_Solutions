// Link to the problem ------> https://www.hackerrank.com/challenges/java-string-compare/problem
public static String getSmallestAndLargest(String s, int k) {
        // First i make a substring of k length which i will use to compare with other substrings of size k
        String startSubstring = s.substring(0,k);
        String smallest = startSubstring;
        String largest = startSubstring;
        
        // Then i take a for loop which will start from 1 index as i already taken the substring "startSubstring" whiich starts from 0,
        // So i will run the loop till length of the string - k to safe me from IndexOutOfBoundsException. 
        for(int i = 1; (i <= s.length() - k); i++){
            String newSubstring = s.substring(i, (i+k));
            
          // Now i compare this newSubstring from my smallest substring if the differnece of first element of both substring is less than 
          // 0 i will update smallest and if greater than 0 i will update larget string value.
            if(newSubstring.compareTo(smallest) < 0){
                smallest = newSubstring;
            }
            if(newSubstring.compareTo(largest) > 0){
                largest = newSubstring;
            }
        }
        
        return smallest + "\n" + largest;
    }
