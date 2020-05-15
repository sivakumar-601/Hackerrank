package language.java.course;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class MD5encrypt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        try{ 
             MessageDigest md =  MessageDigest.getInstance("MD5"); 
           //replace MD5 with SHA-256 for another encryption SHA-256
             md.update(text.getBytes());
             byte[] textInBytes = md.digest();
             //printing in HEX format and padding with zeros and width2
             //x is for hash code
             for(byte textByte : textInBytes){
                 System.out.printf("%02x",textByte);
             }
        }catch(Exception e){
           
        }

    }
}