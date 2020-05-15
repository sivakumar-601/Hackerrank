package language.java.course;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class StudentReflect{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
 }


public class ReflectionGetMethodsEx {
	 public static void main(String[] args){
         Class student = StudentReflect.class;
         Method[] methods = student.getDeclaredMethods();

         ArrayList<String> methodList = new ArrayList<>();
         for(Method elem : methods){
             methodList.add(elem.getName());
         }
         Collections.sort(methodList);
         for(String name: methodList){
             System.out.println(name);
         }
     }

}
