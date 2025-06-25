package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방법 :  메모리 주소접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에 따른 출력만 존재
//        streamApi : java에서 함수형 프로그래밍을 지원하는 라이브러리
//         foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행

//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
////        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("javascript");
//        Stream<String> stream1= myList.stream();
//        String[] myArr = new String[3];
//        myArr[0] ="HTML";
//        myArr[1] ="CSS";
//        myArr[2] ="javascript";
//        Stream<String>stream2=Arrays.stream(myArr);
//
////        원시자료형을 위한 스트림객체가 별도로 존재.
//        int[] intArr = {10,20,30,40,50};
//        IntStream stream3 = Arrays.stream(intArr);
//
////        stream의 중개연산(변환) : filter, map, sorted, distinct, mapToInt
//        int[] intArr = {10,10,30,40,50};
////        30보다 작은 값들의 총합
////        filter: 특정기준으로 대상을 filtering하여 새로운 스트림 반환하는 중개연산 메서드
////        sum: 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
////        소모라고 하는 이유는 한번 forEach메서드로 값을 반환하면 다시는 사용할 수 없기 때문이다.
//        int total = Arrays.stream(intArr).filter(a-> a<=30).sum();
//        System.out.println(total);
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10,10,30,40,50};
////        10씩 곱한다음에 토탈값을 구한다
//        int total1 = Arrays.stream(intArr2).map(a->a*10).sum();
//        int[] newIntArr = Arrays.stream(intArr2).map(a->a*10).toArray();
//        System.out.println(newIntArr);
//
////        distinct : 중복제거
//        int[] intArr3 = {10,10,30,40,50};
//        int total2 = Arrays.stream(intArr3).distinct().sum();
//
////        sorted : 정렬
//        int[] intArr4 = {10,40,10,30,50};
//        int[] newArr = Arrays.stream(intArr3).sorted().toArray();
//        System.out.println(Arrays.toString(newArr));
//
////        mapToInt: intstream 형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        모든 문자열길이의 총합
//        int lengthTotal = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        System.out.println(lengthTotal);

//        int[] arr ={1,2,3,4,5,6};
////        arr에서 홀수만 담은 배열 생성후 출력
//        int[] newArr1 = Arrays.stream(arr).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(newArr1));
//
////        arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] newArr2 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(newArr2));
//
////        arr에서 홀수만 거르고 제곱값을 구하고 해당 숫자값을 오름차순 순서로 배열을 생성후 출력
//        int[] newArr3 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).sorted().toArray();
//        System.out.println(Arrays.toString(newArr3));

//        스트림의 소모 : forEach(출력 시에 주로 사용), sum(합계), max, min, count, reduce(누적연산), findFirst: stream의 첫번째 값 리턴
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a)); ///stream안에서는 외부의 변수를 할당할 수 없음
//        int total = Arrays.stream(intArr).sum();
////        Optional 객체 :  값이 있을수도 있고 없을수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt(); ///max는 값이 있을 수도 없을수도 있어서 이것만 쓰면 에러발생|getAsInt는 값이 있는 걸 아니까 출력하라는 명령어이다.
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();

//        reduce : 누적연산 -> reduce(초기값, 연산식)  /// 매개변수가 두개가 나오는데 처음에 나오는 값은 누적하는 값을 저장해둬야함
//        int accSum = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(accSum);
//
//        int accMultiply = Arrays.stream(intArr).reduce(1,(a,b)->a*b);
//        System.out.println(accMultiply);
//
//        String[] stArr={"hello","java","world"};
////        hellojavaworld
//        String accStr = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(accStr);
//
////        findFirst : 첫번째 요소 반환
//        String firstSt = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(firstSt);

//        주의사항 : 제네릭의 타입소거
//        자바의 런타임시점에 <String>과 같은 제네릭의 타입소거가 발생한다.
//        제네릭의 타입소거로 인해 toArray를 통해 바로 새로운 String배열을 만드는 것은 불가하다.
//        int 배열은 제네릭 타입소거가 일어나지 않는 이유는 intstream이라는 또다른 객체이기에 타입소거가 일어나지 않는 것이다.
//        String[] stArr={"hello","java","world"};
////        String[] answer = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(a->new String[a]); ///toArrat속 a에 이 스트림의 사이즈가 담겨있다
////        여기서 클래스명은 String이고 메서드는 new이다(toArray내부내용 중)
//        String[] answer = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(String[]::new);
//
//
////        메서드 참조 : 하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식. 클래스명::메서드명
//        Arrays.stream(stArr).forEach(System.out::println);



////        StreamApi실습
////        List에 Student객체 4개 담기 : {"kim",20},{"kim",20},{"kim",20},{"kim",20}
//        List<Student> newStudent = new ArrayList<>();
//        newStudent.add(new Student("kim",45));
//        newStudent.add(new Student("lee",35));
//        newStudent.add(new Student("park",29));
//        newStudent.add(new Student("yoon",23));
//
////        1) 모든 객체의 평균나이
//        double averageAge=  newStudent.stream().mapToInt(a-> a.getAge()).average().getAsDouble();
////        2) 정렬을 통한 가장 나이 어린 사람 찾기
//        Student s1 = newStudent.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).findFirst().get();
//        System.out.println(s1);
////        3) 30대인 사람들의 이름만 모아서 새로운 String배열에 담기
//        String[] arr = newStudent.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(arr));
//

////        Optional 객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        String st1 = null;
//        if (st1!=null){
//            System.out.println("hello");
//        }else {
//            System.out.println("값이 없습니다.");
//        }
//        Optional<String>opt1 = Optional.ofNullable("hello");
//        if (opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다");
//        }

//        Optional객체 생성방법 3가지
        Optional<String> opt1 = Optional.empty(); /// 비어있는 Optional객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); /// 비어있는 Optional 객체 생성 / null이 들어갈수도 값이 들어갈 수도 있다.
        Optional<String> opt2_2 = Optional.ofNullable("hello"); ///값이있는 Optional 객체 생성
        Optional<String> opt3 = Optional.of("hello"); ///값이 있는 Optional객체 생성 / of()메서드에는 값이 null일경우 런타임에러발생

////        Optional 객체 처리방법 4가지
////        방법 1. isPresent()로 확인 후에 get()
//        if(opt2_1.isPresent()){
//            System.out.println(opt2_1.get());
//        }else {
//            System.out.println(opt2_1.get()); ///에러 발생
//            System.out.println("값이 없습니다.");
//        }

////        방법 2. orElse() : 값이 있으면 있는 값 return, 없으면 저장한 값 return
//        System.out.println(opt2_1.orElse("값이 없습니다"));
//        System.out.println(opt2_2.orElse("값이 없습니다"));

////        방법 3. orElseGet() : 값이 있으면 있는 값 return 없으면 람다함수 실행
//        System.out.println(opt2_2.orElseGet(()->new String("값이 없습니다.")));

////        방법 4. (가장 많이 사용) orElseThrow : 값이 있으면 있는 값 return, 없으면 지정된 예외(에러)강제 발생.
////        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 강제로 예외 발생시키는 경우는 매우 많음.
//        System.out.println(opt2_1.orElseThrow(()->new RuntimeException("값이 없습니다."))); ///의도한 에러 발생
////        잘못된 값이 DB에 저장되는 것을 방지하고자 위와 같이 강제로 에러를 발생시키는 것이다.
//        System.out.println(opt2_1.get()); ///의도치 않은 에러 발생

//        Optional객체 예시1
        List<Student> studentList = new ArrayList<>();
////        평균 구하기 방법1
//        OptionalDouble age = studentList.stream().mapToInt(a->a.getAge()).average();
//        if (age.isPresent()){
//            System.out.println(age.getAsDouble());
//        }else {
//            throw new NoSuchElementException("값이 없습니다.");
//        }

////        평균구하기 방법 2
//        System.out.println(studentList.stream().mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다. 확인해주세요")));



//        Optional객체 예시2(매우 중요!)

        studentList.add(new Student("kim",45)); ///리스트를 DB라고 생각해야함.
        studentList.add(new Student("lee",35));
        studentList.add(new Student("park",29));
        studentList.add(new Student("yoon",23));
        System.out.println("조회하고자 하는 student의 index번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int indexNumber = Integer.parseInt(sc.nextLine());

//        System.out.println(studentList.get(indexNumber));/// 이러면 없는 인덱스 값에 대한 에러가 발생할 수 있음
//        index범위가 List안에 있으면 Optional.ofNullable 또는 of, ofEmpty 생성
        Optional<Student>optStudent;
        if (studentList.size()<=indexNumber){
            optStudent = Optional.empty();
//            optStudent = Optional.ofNullable(null); ///위와 같은 코드
        }else {
            optStudent = Optional.of(studentList.get(indexNumber));
        }
        System.out.println(studentList); ///전체조회
        System.out.println(optStudent.orElseThrow(()-> new NoSuchElementException("값이 없습니다."))); ///상세조회



    }
}
