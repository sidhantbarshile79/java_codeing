package com.yash.conditional.if_else;
import java.util.*;

public class DayName
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();

        System.out.println(getDayName(n));
    }
    public static String getDayName(int n)
    {
        String dayName=" ";
        switch (n)
        {
            case 1: dayName= "Monday";
                    break;
            case 2: dayName="Tuesday";
                    break;
            case 3: dayName="Wednesday";
                    break;
            case 4: dayName="Thusday";
                    break;
            case 5: dayName="Friday";
                    break;
            case 6: dayName="Saturday";
                    break;
            case 7: dayName="Sunday";
                    break;
            default: dayName="Invalid...";

        }
        return dayName;
    }
}
