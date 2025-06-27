package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        // Thread : 작업의 주최가 한명이면 단일 쓰레드, 여러명이면 멀티 쓰레드.
        // 단일 쓰레드 실행
        /*
        for (int i=0; i<1000; i++){
            Library.borrow();
        }
        System.out.println(Library.getBookCount());
         */

        // 멀티쓰레드 생성 방법
        // 방법1. 쓰레드 클래스 상속 방식
        // Thread 클래스 안에 start 메서드 내장되어 있고, start 메서도는 run 메서드 호출하면서 쓰레드 생성.
        // 각 스레드의 코드의 실행순서는 보장되지 않음.
        /*
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        // System.out.println("hello World!"); <- 가장 먼저 출력됨

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        // System.out.println("hello World!"); // <- 나중에 출력됨
        */




        // 방법2.Runnable을 직접 구현한 객체를 Thread 클래스 생성자에 주입하는 방식
        /*
        new Thread(()-> System.out.println("쓰레드 실행시작(MyThread)1")).start();
        new Thread(()-> System.out.println("쓰레드 실행시작(MyThread)2")).start();
        new Thread(()-> System.out.println("쓰레드 실행시작(MyThread)3")).start();
        new Thread(()-> System.out.println("쓰레드 실행시작(MyThread)4")).start();
        System.out.println("hello world");
        */
        //  멀티쓰레드 동시성 이슈 테스트
        for (int i=0; i<1000; i++) {
            Thread t1 = new Thread(()->Library.borrow());
            t1.start();
            t1.join(); // 두번째 방법 - 한 쓰레드의 작업이 모두 완료될 때, 다른 쓰레드 생성하여 작업 수행. -> 사실상 단일 쓰레드처럼 동작하므로, 성능저하 발생.
        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount()); // main 스레드가 실행


    }
}
