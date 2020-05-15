package language.java.course;

import java.io.*;
import java.util.*;

public class ExceptionTryCatch {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      try{
            int x = sc.nextInt();
            int y = sc.nextInt();    
            System.out.println(x/y);        
        }
        catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }catch(ArithmeticException ae){
            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
        }catch(Exception i){
            System.out.println(i.getMessage());

        }
    }
}
