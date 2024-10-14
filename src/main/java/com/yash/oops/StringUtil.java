package com.yash.oops;
import java.util.*;

public class StringUtil{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First name :");
        String firstname= sc.next();
        System.out.println("Enter last name :");
        String lastname= sc.next();
        System.out.println("Enter Year of Birth :");
        String yearofbirth=sc.next();
        StringUtil su = new StringUtil();
        System.out.println("PAssword is : "+su.generatePassword(firstname,lastname,yearofbirth));
    }
    public String generatePassword(String firstName,String lastName, String yob)
    {
        String str = firstName.substring(1,5);
        String str1 = lastName.substring(2,4);
        String str3 = yob.substring(2,4);
        String output = str+str1+str3;
        return output;    }
}