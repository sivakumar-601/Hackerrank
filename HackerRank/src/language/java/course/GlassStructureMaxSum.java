package language.java.course;

/**
 * 6 * 6 matrix 
 * 
 * glass structre a b c
 *                  d
 *                e f g
 * 
 * display maximum value
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GlassStructureMaxSum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxGlassValue = -99999999;
        for(int i=0 ; i<=3 ; i++){
            for(int j=0;j<=3;j++){
                int tempGlassValue = 0;
                tempGlassValue += arr[i][j]+arr[i][j+1]+arr[i][j+2];
                tempGlassValue += arr[i+1][j+1];
                tempGlassValue += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(tempGlassValue>maxGlassValue){
                    maxGlassValue = tempGlassValue;
                }
            }
        }
        System.out.println(maxGlassValue);
        scanner.close();
    }
}
