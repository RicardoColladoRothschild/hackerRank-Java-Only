import java.io.*;
import java.util.*;

public class Palidrom {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        String reverse = new StringBuilder(A).reverse().toString();
        if(A.equalsIgnoreCase(reverse)){
            
            System.out.println("Yes");
        }else{
            
            System.out.println("No");
        }
        
    }
}


