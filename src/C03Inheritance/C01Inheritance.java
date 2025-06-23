package C03Inheritance;
//extends키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는 것
//java에서는 클래스의 다중상속을 지원하지 않음 | 이유는 같은 메서드가 중복될 경우에 누구의 메서드 인지 구분할 수 없고 어떤걸 우선시 해야할지 모르고
// 어떤 클래스의 메서드를 호출하는 것인지에 대한 혼선이 존재한다

public class C01Inheritance extends Parents {
    public int b =20;
    public static void main(String[] args) { /// 자식클래스에 무언가 동일한이름의 변수 메서드를 지정하면 자식클래스가 우선됨
        C01Inheritance c1 = new C01Inheritance();
//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
//        System.out.println(c1.c); c는 출력불가함

//        메서드 상속
        c1.m1();
        c1.m2();

    }
//    부모 메서드의 재정의(overriding) : 부모클래스의 메서드명과 자식클래스의 메서드명이 동일한 상황
//    오버로딩 : 매개변수의 개수와 타입이 다른 같은 이름의 메서드 선언
//    오버라이딩 :  부모클래스의 메서드를 자식클래스에서 재정의한 것
    @Override /// override된 메서드임을 명시적으로 표현하는 표현식이다. / 붙이나 안붙이나 기능은 하지만 성능최적화를 위해 해당 키워드를 붙여주는 것이 더 좋음
    public void m1(){
        System.out.println("자식클래스 입니다.");
    }

    public void m2(){
        System.out.println("자식클래스의 m2메서드입니다.");
    }
}

class Parents { /// 자신만의 클래스를 정의함.
    public int a = 10;
//    private 접근제어자는 클래스 내부에서만 접근가능 | 자식클래스에서도 접근 불가.
    private int c = 20;

    public void m1(){
        System.out.println("부모 클래스 입니다.");
    }
}
