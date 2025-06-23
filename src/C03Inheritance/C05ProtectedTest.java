package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass(); ///4번 클래스를 객체로 선언
        p1.st1="hello python"; /// public 접근제어자는 전역 접근 가능
//        p2.st2 = "hello python" | 접근 불가 ///private은 이를 선언한 곳에서만 컨트롤가능
        p1.st3="hello python"; ///위에서 선언한 객체를 통해 위치를 지정해서? 가능??

    }
}
