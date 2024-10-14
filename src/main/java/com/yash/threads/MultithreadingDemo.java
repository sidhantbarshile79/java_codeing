package com.yash.threads;

public class MultithreadingDemo extends Thread
    // step 1: extend thread class
{
    //sete 2: implementing run method
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
        //step 3: creating object
        MultithreadingDemo t1=new MultithreadingDemo();
        t1.start();
    }
}
