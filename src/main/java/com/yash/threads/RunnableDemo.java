package com.yash.threads;

class RunnableDemo1 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running...");
    }
}

public class RunnableDemo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running using runnable...");
    }

    public static void main(String[] args)
    {
        RunnableDemo mt=new RunnableDemo();
        Thread t1=new Thread(mt);
        t1.start();
    }
}
