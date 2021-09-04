// Link to the problem ---------------> https://www.hackerrank.com/challenges/java-anagrams/problem
// Approach 1 using HashMap
static boolean isAnagram(String a, String b) {
        if(a == null || b == null || a.equals("") || b.equals("")) return false;
        
        if(a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        
        // Maintains a map which stores the number of occurances of each character in a string
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<Character, Integer>();
        
        for(int i = 0; i < chars1.length; i++){
            if(!map.containsKey(chars1[i])){
                map.put(chars1[i], 1);
            }
            else{
                Integer freq = map.get(chars1[i]);
                // Post incrementing the freq of that character
                map.put(chars1[i], ++freq);
            }
        }
        
        for(int j = 0; j < chars2.length; j++){
            if(!map.containsKey(chars2[j])) return false;
            
            Integer freq = map.get(chars2[j]);
            if(freq == 0) 
                return false;
            else{
                map.put(chars2[j], --freq);
            }  
        }
        return true;
    }


  // Approach 2 using character concept
  static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        for(char c = 'a'; c <= 'z'; c++){
            // Getting  particular character and then looping through the whole staring and incresase the sum if found in a string 
            // and simultaneously decrementing sum if found in b string
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == c) sum++;
                if(b.charAt(i) == c) sum--;
            }
            // After looping through the entire string if sum is not equal to 0 then returns 0 otherwise continue the loop
            if(sum != 0) return false;
        }
        return true;
    }











