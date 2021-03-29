package com.ramesh.springboot.coreJava;

import lombok.SneakyThrows;

public class Welcome {

    public static int  counter =0;
    public static int countb = 0;

    public static void countweprocess() {
        synchronized (Welcome.class) {
            counter++;
        }
    }

    public static void countproc() {
         synchronized (Welcome.class) {
            countb++;
        }
    }

    public static void process() {
        // Thread 1.
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<2500; ++i){
                    countweprocess();
                   // countproc();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j=0;j<2500;j++){
                   // countweprocess();
                    countproc();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The Current Count is => "+counter);
        System.out.println("The Current Count Project value => "+countb);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }


    //https://www.freetutorialsus.com/introduction-to-collections-generics-in-java-udemy-course-free-download/

       /*
        System.out.println("Programming start..");
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread name is => "+name);

        Thread runner1 = new Thread(new Runner1());
        Thread runner2 = new Thread(new Runner2());
        //Runner1 runner1 = new Runner1();
        //Runner2 runner2 = new Runner2();
        runner1.setDaemon(true);
        runner1.start();
        System.out.println("Is " + runner1.getName()
                + " a Daemon Thread: "
                + runner1.isDaemon());

        System.out.println("Is " + Thread.currentThread().getName()
                + " a Daemon Thread: "
                + Thread.currentThread().isDaemon());
        runner2.start();


        //System.out.println("Programming End..");
    }
        */

}


class Runner1 implements Runnable  {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            while (true) {
                System.out.println("Demon Thread is running ...");
            }
    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Normal Thread is running ...");
    }
}