package introduction.s3;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-if-else?h_r=next-challenge&h_v=zen
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {

            if (1 < n && n < 6) {
                ans = "Not Weird";
            } else if (5 < n && n < 21) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);

    }
}

