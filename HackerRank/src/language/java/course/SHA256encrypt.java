package language.java.course;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class SHA256encrypt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            byte[] textInBytes = md.digest();
            for(byte textByte : textInBytes){
                System.out.printf("%02x",textByte);
            }
        }catch(Exception e){

        }
    }
}