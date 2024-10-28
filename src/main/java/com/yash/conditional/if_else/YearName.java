package com.yash.conditional.if_else;
import java.util.*;

public class YearName
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int year=sc.nextInt();

        System.out.println(getYearName(year));
    }
    public static String getYearName(int year)
    {
        String YearName=" ";
        switch (year)
        {
            case 1: YearName="Janaury";
                    break;
            case 2: YearName="Febury";
                    break;
            case 3: YearName="March";
                    break;
            case 4: YearName="April";
                    break;
            case 5: YearName="May";
                    break;
            case 6: YearName="June";
                    break;
            case 7: YearName="July";
                    break;
            case 8: YearName="August";
                    break;
            case 9: YearName="September";
                    break;
            case 10: YearName="Octumber";
                    break;
            case 11: YearName="November";
                    break;
            case 12: YearName="December";
                    break;
            default: YearName="Invalid Request...!";
        }
        return YearName;
    }
}
