package language.java.course;

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOfKeyword{
	
   static String count(ArrayList mylist){
      int student = 0;
      int rockstar = 0;
      int hacker  = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student)
        	 student++;
         if(element instanceof Rockstar)
        	 rockstar++;
         if(element instanceof Hacker)
        	 hacker++;
      }
      String ret = Integer.toString(student)+" "+ Integer.toString(rockstar)+" "+ Integer.toString(hacker);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}