package language.java.course;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListXYposition {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> dataSets = new ArrayList<>();
        int noOfRecords = sc.nextInt();
       
        for (int i = 0; i < noOfRecords; i++){
        	ArrayList<Integer> innerDataList = new ArrayList<>();
        	int totalDigits = sc.nextInt();
        	
        	for(int j = 0; j < totalDigits ; j++) {
        		int num = sc.nextInt();
        		innerDataList.add(num);
        	}
        	
        	dataSets.add(innerDataList);
        }
        
        
        int noOfTests = sc.nextInt();
        for (int i = 0; i < noOfTests; i++){
        	int t1 = sc.nextInt();
        	int t2 = sc.nextInt();
        	 try{
                 System.out.println(dataSets.get(t1-1).get(t2-1));
             }
             catch(Exception e)
             {
                 System.out.println("ERROR!");
             }
        }
        
	}
}
