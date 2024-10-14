package com.yash.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercise {

    // method
    public static int countCharacters(List<String> list)
    {
        int count=0;
        List<String> list1=new ArrayList<>();
        //pass the argument list into method list1
        list1=list;
        for(int i=0;i<list1.size();i++)
        {
            String n=list1.get(i);
            count+=n.length();
        }
        System.out.println("Count of charaters in list is : "+count);
        return 0;
    }
    public static List<String> split(String string)
    {
        List<String> list1=new ArrayList<>();

        for(int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            String characters=String.valueOf(c);
            list1.add(characters);
        }
        System.out.println(list1);
        return null;
    }

    public static List<String> uppercased(List<String> list)
    {
        List<String> list1=new ArrayList<>();
//        int iter=list1.size();
        for(int i=0;i<list.size();i++)
        {
            String str=list.get(i);
            String str2=str.toUpperCase();
            list1.add(str2);
        }
        System.out.println(list1);
        return null;
    }



    public static boolean allCapitalizedWords(List<String> list)
    {
        boolean iscapital=false;
        for(int i=0;i<list.size();i++)
        {
            String str=list.get(i);
            if(str.charAt(0)=='A'|| str.charAt(0)=='B'||str.charAt(0)=='C'||str.charAt(0)=='D'||str.charAt(0)=='E'||str.charAt(0)=='F'||str.charAt(0)=='G'||str.charAt(0)=='H'||str.charAt(0)=='I'||str.charAt(0)=='J'||str.charAt(0)=='K'||str.charAt(0)=='L' && str.charAt(0)=='M' && str.charAt(0)=='N' && str.charAt(0)=='O' && str.charAt(0)=='P' && str.charAt(0)=='Q' && str.charAt(0)=='R' && str.charAt(0)=='S' && str.charAt(0)=='S' && str.charAt(0)=='T' && str.charAt(0)=='V' && str.charAt(0)=='W' && str.charAt(0)=='X'&& str.charAt(0)=='Y'&& str.charAt(0)=='Z' && str.charAt(0)=='U')
            {
                iscapital=true;
            }
            else
            {
                iscapital=false;
            }
        }
        if(iscapital==false)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
        return false;
    }

    public static List<String> filterContaining(List<String> list, char c)
    {
        list.removeIf(str -> str.indexOf(c) != -1);
        return list;
    }

    public static void insertInOrder(String string, List<String> list)
    {
        List<String> List = new ArrayList<>(list);
        list.add(string);
        Collections.sort(list);
        System.out.println(list);
    }
}



class ListExerciseTest
{
    public static void main(String[] args) {
        List<String> list2=new ArrayList<String>();
//        list2.add("Siddhant");
//        list2.add("Siddhantb");
        ListExercise1 obj=new ListExercise1();
//        obj.countCharacters(list2);
//          obj.uppercased(list2);
//            obj.allCapitalizedWords(list2);
//        System.out.println(obj.filterContaining(list2,'c'));
        obj.insertInOrder("siddhantb",list2);

    }
}
