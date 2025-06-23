package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog d1 = new Dog(); ///왼쪽에 객체명 오른쪽에 사용할 클래스명을 지정하여 객체선언해줌
        d1.sound(); ///객체를 통해 메서드 호출

        Cat c1 = new Cat();
        c1.sound();

//        상속관계일 때는 부모클래스의 타입을 자식클래스의 객체의 타입으로 지정하는 것이 가능
//        부모클래스의 타입을 지정 시 부모클래스에서 정의된 메서드만 객체에서 사용 가능.
        Animal d2 = new Dog(); ///여기서는 dog을 참조하지 않고 animal(부모)를 타입으로 지정했기에 dog클래스에만 있던 메서드를 호출하는 건 불가함
        d2.sound();
//        d2.sound2() ///사용 불가
    }
}

class Animal{ /// 부모클래스
    void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }

}

class Dog extends Animal { /// 자식클래스
    @Override /// 상속받은 메서드의 오버라이드
    void sound() {
        System.out.println("멍멍");
    }
    void sound2() { /// 자식클래스만의 내부 메서드
        System.out.println("멍멍멍멍");
    }
}

class Cat extends Animal{ /// 자식클래스
    @Override /// 상속받은 메서드의 오버라이드
    void sound() {
        System.out.println("야옹");
    }
}

///여러개의 자식클래스는 한가지 부모클래스를 상속받을 수 있음 cat과dog 클래스 모두 animal클래스를 상속받는 것 처럼