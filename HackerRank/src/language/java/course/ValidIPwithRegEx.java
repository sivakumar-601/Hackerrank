package language.java.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*** Hi
 * Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56

Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

 *
 */

class ValidIPwithRegEx{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
     String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
}