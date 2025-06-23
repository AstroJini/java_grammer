package C03Inheritance;

//부모클래스를 상속받을 때, 부모클래스에 기본생성자가 없으면 자식클래스에서 상속 시 기본적으로 에러발생

public class C02SuperKeyword extends SuperParents {
    int a =10;
    C02SuperKeyword() {
//        super() : 부모클래스의 생성자를 호출하는 메서드
        super(120);
        this.a = 10;
    }
    public static void main(String[] args) { /// 자식 클래스의 main
        C02SuperKeyword c2 = new C02SuperKeyword(); ///자식클래스를 객체로 선언해줌
        System.out.println(c2.a); ///상속받은 a값을 자식클래스에서 호출이 가능함을 보여줌
        c2.display(); ///자식클래스 내부의 새로운 메서드 생성한걸 호출
    }
    public void display(){
        System.out.println("자식의 변수 + " + a);/// 자식클래스가 가지고있는 변수a의 값
        System.out.println("부모의 변수 + " + super.a); ///super키워드를 통해 부모클래스를 통해 상속받은 a의 값을 출력
    }
}

class SuperParents {
    int a = 20;
    
    public SuperParents(int a){ /// 생성자
        this.a=a;
    }
//    public SuperParents(){ /// 부모클래스에서 상속해줄 때 기본 상속자가 없으면 에러 발생
//
//    }
}