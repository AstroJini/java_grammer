package C03Inheritance;

//부모클래스를 상속받을 때, 부모클래스에 기본생성자가 없으면 자식클래스에서 상속시 기본적으로 에러발생

public class C02SuperKeyworld extends SuperParents {
    int a =10;

    C02SuperKeyworld() {
//        super() : 부모클래스의 생성자를 호출하는 메서드
        super(120);
        this.a = 10;
    }
    public static void main(String[] args) {

        C02SuperKeyworld c2 = new C02SuperKeyworld();
        System.out.println(c2.a);
        c2.display();
    }
    public void display(){
        System.out.println("자식의 변수 + " + a);
        System.out.println("부모의 변수 + " + super.a);
    }
}

class SuperParents {
    int a = 20;
    
    public SuperParents(int a){
        this.a=a;
        
    }
    public SuperParents(){
        
    }
}