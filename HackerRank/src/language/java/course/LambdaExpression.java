package language.java.course;
import java.io.*;
import java.util.*;

/***
 * t: no.of testcase
 * after 
 * a b :
 *  a is type:either isOdd,isPrime,isPolindrome
 *  b is input number
 *
 */

interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
  
   // Write your code here
  public static PerformOperation isOdd(){
      return (a)->a%2!=0;
  }
   
  public static PerformOperation isPrime(){
    return   a->{
          int countFlag = 0;
          for(int i=2;i<=a/2;i++){
              if(a%i==0)
                countFlag++;
          }
          if(countFlag>0)
             return false;
          else
             return true;
      };
  }
  
  public static PerformOperation isPalindrome(){
     return    (a)->{
          String numStr = String.valueOf(a);
          String numStrRev = new StringBuilder(String.valueOf(a)).reverse().toString();
          if(numStr.equals(numStrRev))
             return true;
          else
              return false;
      };
  }


}



public class LambdaExpression {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
