package com.bhavesh16281.app.runnables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppRunnable implements Runnable{
    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\selfIntro.txt"))){
            String line;

            while((line = reader.readLine())!=null){

                System.out.println(Thread.currentThread().getName()+" reading the line: "+line);
            }
        } catch (IOException e) {
            Logger.getLogger(AppThread.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
