package pcd.lab04.liveness.simplest_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void Main(String[] arg) {

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock1.lock();
            lock2.lock();
        });

        Thread t2 = new Thread(() -> {
            lock1.lock();
            lock2.lock();
        });

        t1.start();
        t2.start();
    }
}
