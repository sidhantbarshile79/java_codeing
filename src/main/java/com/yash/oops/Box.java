package com.yash.oops;

public class Box {
    int height;
    int width;
    int depth;
    Box(int height,int width,int depth){
        this.height=height;
        this.depth=depth;
        this.width=width;
    }
    public int volume(){
        return height*width*depth;
    }
    public static void main(String[] args) {
        Box obj=new Box(2,2,2);
        int ans=obj.volume();
        System.out.println("The volume of the box is: "+ans);
    }
}
