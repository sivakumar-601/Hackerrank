package language.java.course;

import java.math.BigDecimal;
import java.util.*;

/**
 
 Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100

 
 
 
 */


class StringToBigDecimalSortComparator{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
        if (o1 == null || o2 == null) {
            return 0;
        }
        BigDecimal o1bd = new BigDecimal(o1);
        BigDecimal o2bd = new BigDecimal(o2);
        return o2bd.compareTo(o1bd);
        }
    });
 
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}