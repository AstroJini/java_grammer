package C06EtcClass;

public class C03EnumMain {

    public static void main(String[] args) {
//        classGrade를 일반문자열로 세팅할 경우 -> 정해진 문자열이 아닌 개별적으로 생성된 문자열 삽입
//        Student s1= new Student("hong", "1학년");
//        Student s2= new Student("hong2", "FirstGrade");
//        Student s3= new Student("hong3", "first_grade");

//        static final을 통해 변수값 관리하는 방법 -> 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재.
//        Student s1= new Student("hong", classGradeGrade.c1);
//        Student s2= new Student("hong2", classGradeGrade.c2);
//        Student s3= new Student("hong3", classGradeGrade.c3);

//        Enum클래스를 활용한 ClassGrade세팅
        Student s1= new Student("hong", ClassGrade.FIRST_GRADE);
//        Student s2= new Student("hong2", ClassGrade."FIRST_GRADE"); ///타입불일치 에러
        Student s3= new Student("hong3", ClassGrade.THIRD_GRADE);
        System.out.println(s1);
//        Enum클래스의 내부에는 값이 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s1.getClassGrade().ordinal());



    }
}
//
//class classGrade{
//    static final String c1 = "FIRST_GRADE";
//    static final String c2 = "SECOND_GRADE";
//    static final String c3 = "THIRD_GRADE";
//}
enum ClassGrade{
    FIRST_GRADE, SECOND_GRADE, THIRD_GRADE;
}
class Student{
    private String name;
    private ClassGrade classGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }
}