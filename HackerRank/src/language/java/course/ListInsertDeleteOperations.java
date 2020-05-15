package language.java.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInsertDeleteOperations {
	
	public static Scanner SC = new Scanner(System.in);
	public static final String INSERT_STR = "Insert";
	public static final String DELETE_STR = "Delete";
	
	public static void main(String args[]) {
	    
		//Storing data
		int noOfRec = SC.nextInt();
	    List<Integer> dataSet = new ArrayList<Integer>();
	    for(int i=0; i<noOfRec; i++) {
	    	int num = SC.nextInt();
	    	dataSet.add(num);
	    }
		
	    //operations adding,removing
	    int noOfTests = SC.nextInt();
	    for(int j=0 ; j<noOfTests ; j++) {
	    	String operation = SC.next();
	    	switch(operation) {
	    	   case INSERT_STR:
	    		   int pos = SC.nextInt();
	    		   int num = SC.nextInt();
	    		   dataSet.add(pos, num);
	    	   break;
	    	   case DELETE_STR:
	    		   int remIndex = SC.nextInt();
	    		   dataSet.remove(remIndex);
	    	   break;
	    	   default:
	    		   System.out.println("Other operation");
	    	   break;
	    	}
	    }
	    
	    //List display
	    displayListElements(dataSet);
	    
	}//main method
    
	public static void displayListElements(List<Integer> dataSet) {
		for(int elem :dataSet) {
			System.out.print(elem+" ");
		}
	}
	
}//class
