package com.bhavesh16281.app;

import com.bhavesh16281.app.runnables.AppThread;

public class TestThreads {

    public static void main(String[] args) {

        AppThread  appThread1 = new AppThread();
        AppThread  appThread2 = new AppThread();
        AppThread  appThread3 = new AppThread();

        appThread1.start();
        appThread2.start();
        appThread3.start();

    }
}
