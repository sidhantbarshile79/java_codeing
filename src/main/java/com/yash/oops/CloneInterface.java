package com.yash.oops;
class CloneInterface implements Cloneable{
    int rollno;
    String name;

    CloneInterface(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }


    public static void main(String args[]){
        try{
            CloneInterface s1=new CloneInterface(101,"Dhanashri");

            CloneInterface s2=(CloneInterface) s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}