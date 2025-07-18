package C03Inheritance;

//class에는 public, default 접근제어자만 존재한다.

public class C04ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자가 존재한다.
//    public : 프로젝트 전체에서 접근 가능(다른 패키지여도 접근 가능)
//    private : 클래스 내에서만 접근 가능
//    default : 생략가능, 해당 패키지 내에서만 접근 가능
//    protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근 가능하다
     public String st1 = "hello java1";
     private String st2 = "hello java2";
     String st3 = "hello java3";
     protected String st4 = "hello java4";
}
