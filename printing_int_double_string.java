/*There are three lines of input:

1.The first line contains an integer.
2.The second line contains a double.
3.The third line contains a String.*/
  
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //String str = scan.nextLine();
        String s = scan.nextLine();
        s = scan.nextLine();
        //scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
