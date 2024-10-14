package com.yash.threads;

import java.util.*;
public class PushPop extends Thread
{
    Stack<Integer> stack=new Stack();

    public void push(int insert)
    {
        stack.push(insert);
    }

    public int pop(int removed)
    {
        while(stack.isEmpty())
        {
            stack.pop();
            System.out.println(stack);
        }

        return removed;
    }

    public static void main(String[] args)
    {
        PushPop pp=new PushPop();
        pp.push(1);
        pp.pop(1);
    }

}
