package C03Inheritance;

import java.util.List;

//fianl키워드가 붙은 class는 상속 불가 | final키워드가 붙은 메서드는 overriding불가.
//public class C06AbstractMain extends FinalParents{
public class C06AbstractMain {
    public static void main(String[] args)  {
//        AbstractDog d1= new AbstractDog();
//        d1.makeSound1();
//        d1.makeSound2();

//        추상클래스는 구현체 없는 메서드가 있으므로 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();
//        a1.makeSound2(); ///구현되어 있지 않은 메서드를 호출하면 실행을 못하기 때문에 불가능함
//        이걸 사용하고 싶으면 상속해서 구현한다음 실행해줘야함.

//        객체의 실체가 dog클래스를 통해 만들어지므로 여기서는 d2의 makesound2를 사용가능
        AbstractAnimal d2= new AbstractDog(); ///왼: 부모클래스, 오: 자식클래스 | d2의 실체는 오른쪽에 있음
        d2.makeSound1();
        d2.makeSound2();

//        모든 메서드가 abstract인 클래스를 인터페이스라 한다.
//        인터페이스는 구현체가 없으므로 기본적으로 별도의 객체 생성 불가
//        List<Integer>myList = new List<>();
    }
}
//추상메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드를 붙이고, 추상클래스가 됨.
abstract class AbstractAnimal{ /// 구현체가 없는 메서드가 하나라도 있으면 abstract메서드
    void makeSound1(){
        System.out.println("동물은 소리를 냅니다.");
    }
//    메서드를 선언만하고 구현이 없는 메서드 선언 시 abstract 키워드 사용
    abstract void makeSound2(); ///이 때는 메서드를 2개 선언해줘야함
}

class AbstractDog extends AbstractAnimal{

    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

final class FinalParents {/// 이 클래스는 상속 불가한 클래스이다

}