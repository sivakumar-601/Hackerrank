package language.java.course;

import java.io.*;
import java.util.*;

/**
 * Input : He is a very very good boy, isn't he?
 * Output : 10
		He
		is
		a
		very
		very
		good
		boy
		isn
		t
		he
 *
 */
public class SplitWithRegEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        // Write your code here.
        if(s.equals("") || s==null){
            System.out.println("0");
        }else{
            String[] names = s.split("[\\s!,?._'@]+");
            System.out.println(names.length);
            for(String elem : names){
                System.out.println(elem);
            }
        }
        scan.close();
    }
}

