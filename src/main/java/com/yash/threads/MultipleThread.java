package com.yash.threads;

public class MultipleThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is executing..." + Thread.currentThread());
//        System.out.println("Name "+ Thread.currentThread());
    }

    public static void main(String[] args)
    {
        MultipleThread t1=new MultipleThread();
        t1.setName("T1 thread");
        t1.setPriority(10);
        t1.start();
        MultipleThread t2=new MultipleThread();
        t2.setName("T2 thread");
        t2.setPriority(1);
        t2.start();
        MultipleThread t3=new MultipleThread();
        t3.setName("T3 thread");
        t3.setPriority(5);
        t3.start();

    }
}
