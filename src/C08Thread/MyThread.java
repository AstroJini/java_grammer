package C08Thread;

public class MyThread extends Thread {
    // Thread 클래스에 내장된 run 메서드는 비어있는 메서드다.
    // run 메서도는 Thread가 시작될 때 자동으로 호출되는 메서드
    // Thread 실행 시, 특정 작업을 수행하고 싶다면, run 메서드를 overriding 해서 코드 작성.
    @Override
    public void run() {
        System.out.println("MyThread 실행 시작");

    }
}
