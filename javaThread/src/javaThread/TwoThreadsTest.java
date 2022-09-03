package javaThread;

class TwoThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("Thread_1").start();
        new SimpleThread("Thread_2").start();
    }
}
