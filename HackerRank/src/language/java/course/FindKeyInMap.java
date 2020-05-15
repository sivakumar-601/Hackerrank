package language.java.course;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindKeyInMap {
	
	public static final Scanner SC = new Scanner(System.in);
	
	public static void main(String args[]) {
		int noOfRec = SC.nextInt();
		
		Map<String,Integer> phoneBookMap = new LinkedHashMap<>(); 
		for(int i=0; i<noOfRec ; i++) {
			String name = SC.next();
			int phoneNum = SC.nextInt();
			phoneBookMap.put(name, phoneNum);
		}
		
		while(SC.hasNext()) {
			String searchName = SC.next();
			if(!searchName.equals("")) {
				if(phoneBookMap.containsKey(searchName)) {
					System.out.println(searchName+"="+phoneBookMap.get(searchName));
				}else {
					System.out.println("Not found");
				}
			}else {
				break;
			}
				
		}
		
	}
}
