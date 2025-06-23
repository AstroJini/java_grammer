package C03Inheritance.ProtectedPackage;
//같은 패키지 내의 클래스가 아닌 경우에는 import필요
import C03Inheritance.*; ///import를 사용하지 않으면 에러가 발생할 거임 | 현재 내 package위치가 import할 package의 위치가 다르기 때문임.
//패키지 바로 하위의 모든 class는 *로 import 가능
//다만, 패키지내의 패키지 안의 class는  *로 import불가
public class ProtectedTest extends C04ProtectedClass{
    public static void main(String[] args) {
        ProtectedTest p1 = new ProtectedTest();
//        ppublic접근제어자는 프로젝트 전역에서 접근 가능
        p1.st1 = "hello python";
//        패키지가 달라졌으므로 default변수는 접근 불가
//        p1.st3 = "hello python";
//        상속관계가 있을 경우, 패키지가 달라도 protected변수에 접근 가능
        p1.st4 = "hello python"; ///상속관계가 아닌 경우에는 protected 변수 사용 불가능

        C04ProtectedClass p2 = new C04ProtectedClass();
//        p2는 부모클래스의 객체이므로 상속관계가 있는 객체가 아니므로 protected 변수에 접근 불가하다.
//        p2.st4="hello python" ///접근 불가능 | 이때는 st4와 상속관계에 있지 않음 그냥 객체를 선언한 것
    }
}
