package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공된다
//        Comparable 인터페이스 : compareTo 메서드 선언
//        Comparator 인터페이스 : compare 메서드 선언

////        String 클래스에 compareTo메서드 내장
////        String 클래스 및 java의 많은 클래스에서 Comparable을 상속하여 compareTo 메서드를 구현
//        String a ="hello";
//        String b ="world";
//        System.out.println(a.compareTo(b)); ///String은 Comparable이란 인터페이스를 implements 하고 있음
//
//        List<String> myList =  new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());
//
////        String안의 CompareTo 메서드를 사용하여 정렬이 이뤄짐
//        Collections.sort(myList);

//        직접 만든 Student를 List에 담아 정렬
        List<Student> studentList = new ArrayList<>(); ///익명객체를 사용한 것이 아님
        studentList.add(new Student("kim", 21));
        studentList.add(new Student("yoon", 25));
        studentList.add(new Student("park", 26));
        studentList.add(new Student("choi", 24));
        studentList.add(new Student("kim", 35));


////        정렬방법 1. Student 객체에서 Comparable을 직접 구현한 방식
////        단점 : Student 객체를 직접 수정해야하므로 유연성이 떨어짐
////        Collections.sort에서 Comparable을 구현한 객체를 요구
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        정렬방법 2. Comparator를 구현한 익명객체를 사용
//        Comparable과 다른점 : 매개변수가 두개
//        Comparator의 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator객체를 요구하기 때문
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        studentList.sort((o1, o2)-> o1.getName().compareTo(o2.getName())); ///람다식 함수로 전환
        System.out.println(studentList);

        String[] stArr={"hello","java","C++","world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr,Comparator.reverseOrder()); ///내림차순
//        글자 길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, (String o1, String o2) -> o1.length()-o2.length()); /// 람다



//        Arrays.sort(stArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
        Arrays.sort(stArr, (o1, o2) ->o2.length()-o1.length());
//        백준 - 단어정렬
//        1. 길이로 정렬 2.길이가 같으면 문자열 정렬
        String[] baekjoon = new String[3];
        baekjoon[0] = "no";
        baekjoon[1] = "more";
        baekjoon[2] = "wait";
        Arrays.sort(baekjoon, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()-o2.length() == 0){
                    return o1.compareTo(o2);
                }else {
                    return o1.length()-o2.length();
                }
            }
        });


        Set<String>treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()-o2.length() == 0){
                    return o1.compareTo(o2);
                }else {
                    return o1.length()-o2.length();
                }
            }
        });

        Queue<String>pq =  new PriorityQueue<>((o1,o2)->o1.length()-o2.length());


        //절댓값힙 :  백준
        System.out.println(Math.abs(-1));
        Queue<Integer>queue= new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1)==Math.abs(o2)){
                    return o1-o2;
                }else {
                    return Math.abs(o1)-Math.abs(o2);
                }
            }
        });


//        배열 안의 배열 정렬
//        [4,5], [1,2] [5,0] [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});
//        정렬: 리스트 안의 배열에 index1번째 값을 기준으로 오름차순
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        for(int[] m : myList){
            System.out.println(Arrays.toString(m));
        }

//        백준: 선긋기
//        arr[0]기준으로 정렬
//        3가지의 경우의 수에 따라 total









    }
}

//class Student implements Comparable<Student>{
class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


////    정렬은 결국 2개의 값을 비교하는 것으로 A와 B대상 2개만 있으면 충분.
////    두 수(또는 문자)의 비교의 경우 음수, 0, 양수 세 값 중에 하나만 return 이를 통해 정렬수행.
////    this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬로직 동작
//    @Override
//    public int compareTo(Student o) {
////        return o.getName().compareTo(this.getName());
//        return this.getAge()-o.getAge(); ///나이를 기준으로 학생을 정렬하는 것
//    }
}

