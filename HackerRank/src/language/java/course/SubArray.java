package language.java.course;

import java.util.Scanner;

/***
 *Displaying subarray and its sum
 *finally displaying negative valued sub arrays 
 *
 */
public class SubArray {
     public static void main(String args[]) {
    	 Scanner scanner = new Scanner(System.in);
    	 int t = scanner.nextInt();
    	 int arr[] = new int[t];

    	 for(int i=0; i<t ;i++) {
        	 arr[i] = scanner.nextInt();
         }
         
    	 int negativeCounts = 0;
    	 for(int i = 0; i < t ; i++) {
    		 //System.out.println("With element : "+arr[i]);
    		 for(int j = i ; j< t ;j++) {
    			 int sum = 0;
    			 for(int k = 0; k < (j-i)+1; k++ ) {
    			//	 System.out.printf(" %d " , arr[i+k]);
    				 sum += arr[i+k];
    			 }
    			 //System.out.printf(": %d " , sum);
    			 if(sum < 0) {
    				 negativeCounts++;
    			 }
    		 } 
    		 
    	 }
    	 System.out.println(negativeCounts);
    	 
     }
}
