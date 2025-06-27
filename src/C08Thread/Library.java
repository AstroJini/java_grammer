package C08Thread;

public class Library {
    private static int bookCount = 100;
    // synchronized : 메서드 내에서 1개의 스레드만 실행되도록 강제.
    // rdb에 재고관리를 할 경우에는 synchronized 를 통한다 하더라도, 쿼리와 커밋 실행 시점에 차이로 인해 동시성 이슈 발생
    // public synchronized static void borrow() { // 메서드 내에서 1개의 스레드만 실행되도록 강제 (동기화)
     public static void borrow() {
        if (bookCount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount-=1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출불가");
        }
    }
    public static int getBookCount() {
            return bookCount;

    }
}
