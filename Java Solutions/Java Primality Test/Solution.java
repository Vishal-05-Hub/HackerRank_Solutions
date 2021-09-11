// Link to the problem---------------> https://www.hackerrank.com/challenges/java-primality-test/problem
// Approach used---------------------> Using BigIntergerclass isProbablePrime method

public class Solution {
    public static void main(String[] args) throws IOException {
        // Scan for thw input using the scanner class
        Scanner in = new Scanner(System.in);
        // Take the nextBigInteger of type BigIntege
        BigInteger n = in.nextBigInteger();
        in.close();
        // Output prime if certainty of the number is greater than 0 other wise not prime 
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
