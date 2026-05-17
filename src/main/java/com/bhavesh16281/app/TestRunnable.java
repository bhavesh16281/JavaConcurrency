package com.bhavesh16281.app;

import com.bhavesh16281.app.runnables.AppRunnable;

public class TestRunnable {

    public static void main(String[] args) {

        AppRunnable appRunnable1 = new AppRunnable();
        AppRunnable appRunnable2 = new AppRunnable();
        AppRunnable appRunnable3 = new AppRunnable();

        Thread thread1 = new Thread(appRunnable1);
        Thread thread2 = new Thread(appRunnable2);
        Thread thread3 = new Thread(appRunnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
