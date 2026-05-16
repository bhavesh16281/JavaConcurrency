package com.bhavesh16281.app.runnables;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppThread extends Thread {

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
