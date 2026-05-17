package com.bhavesh16281.app;

import com.bhavesh16281.app.runnables.AppThread;

public class TestThreads {

    public static void main(String[] args) {

        AppThread  appThread1 = new AppThread(); //State of the thread is New
        AppThread  appThread2 = new AppThread();
        AppThread  appThread3 = new AppThread();

        appThread1.start(); //State of the thread is Runnable
        appThread2.start();
        appThread3.start();

        //State of the thread is Running when JVM schedules the thread for execution.
        //State of the thread is Dead/Terminated when job of the thread is completed.
    }
}
