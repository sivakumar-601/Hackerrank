package language.java.course;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesSet {
   
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int noOfRec = sc.nextInt();
		sc.nextLine();
		Set<String> dataSet = new HashSet<>();
		for(int i=0 ; i<noOfRec ; i++) {
			String name = sc.nextLine();
			dataSet.add(name);
			System.out.println(dataSet);
			System.out.println(dataSet.size());
		}
	}
}
