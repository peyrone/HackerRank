import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int x=i; x<=j; x++) {
            int r = reverseNumber(x);
            int m = Math.abs(x-r)%k;
            if (m == 0) count++;
        }

        return count;
    }

    static int reverseNumber(int num) {
        String s = "";
        String txt = String.valueOf(num);

        for(int i=txt.length()-1; i>=0; i--) {
            s += txt.charAt(i);
        }

        return Integer.parseInt(s);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
