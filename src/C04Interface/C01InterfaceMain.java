package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();
        C01Dog d1 = new C01Dog();
        d1.makeSound();

//        다형성 : 하나의 부모타입으로 여러 자식 객체를 다룰 수 있음.
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makeSound();
        C01Dog d2 = new C01Dog();
        d2.makeSound();

//        예시
//        인터페이스의 장점 : 개발의 표준을 지정할 수 있음
//        다형성의 장점 : 왼쪽에 부모타입을 적는 이유 |
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        List<Integer> myList2 = new LinkedList<>();
        myList2.add(10);

//        다중상속(구현)
//        C01Cat c3 = new C01Cat(); ///두 메서드를 모두 쓰고 싶은 경우는 이렇게 입력
        C01AnimalInterface1 c3 = new C01Cat(); ///두 메서드를 모두 쓰고 싶은 경우는 이렇게 입력
        c3.makeSound();
        C01AnimalInterface2 d3 = new C01Dog();
        d3.play("말티푸", "시바견");

//        다중구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한
        List<Integer>myList3 = new ArrayList<>();

        myList3.add(10);
        myList3.add(40);
        myList3.get(0);


//        다중구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한.
        List<Integer>list = new LinkedList<>();
        Queue<Integer>queue=new LinkedList<>();


    }
}
