package C10Annotation;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        리플랙션 : 자바에서 런타임시점에 클래스의 변수를 수정할 수 있는 기능.
        Person p1 = new Person();
//        아래와 같은 방식을 통해 private 변수인 name 변수에 직접접근
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true); ///private이라 할지라도 접근가능하도록 세팅변경
        nameField.set(p1, "youn");
        System.out.println(p1);
    }
}

class Person{
    private String name;

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


