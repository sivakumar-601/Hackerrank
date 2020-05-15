package language.java.course;
import java.lang.reflect.Method;

/**
 * 
 * @author Siva Kumar
 * To display elements in list either string typed or integer...etc
 */

class Printer
{
    public <E> void printArray(E[] paramArray){
        for(E elem : paramArray){
            System.out.printf("%s",elem);
            System.out.println();
        }
    }  
 
}

public class GenericMethodEx {
	    public static void main( String args[] ) {
	        Printer myPrinter = new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	        int count = 0;

	        for (Method method : Printer.class.getDeclaredMethods()) {
	            String name = method.getName();

	            if(name.equals("printArray"))
	                count++;
	        }

	        if(count > 1)System.out.println("Method overloading is not allowed!");
	      
	    }
}
