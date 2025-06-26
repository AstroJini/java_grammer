package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C02File {
    public static void main(String[] args) throws IOException {
////        콘솔창에 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

////        파일에서 읽기 : IO패키지 -IO는 입출력
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test.txt/"));
//        String line = br2.readLine();
//        while (line!=null){
//            System.out.println(line);
//            line = br2.readLine();
//        }
////        파일에서 읽기 : NIO패키지 / N 은 Non-blocking 의 약어이다.
//        Non-Blocking: 비동기 -동시작업 막지 않음
//        Blocking: 동기 - 동시 작업 막음

//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt/");
////        readString : 문자열 전체를  통채로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
////        readAllLines: 문자열을 라인별로 split 하여 list형태로 저장
//        List<String> st2 = Files.readAllLines(filePath);
//        for (String l : st2){
//            System.out.println(l);
//        }
//        System.out.println(st2);

//        파일쓰기
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt/");
        Files.write(filePath,"홍길동0\n".getBytes(), StandardOpenOption.CREATE_NEW); // CREATE_NEW : 새로입력
        Files.write(filePath,"홍길동1\n".getBytes(), StandardOpenOption.WRITE); // WRITE : 덮어쓰기
        Files.write(filePath,"홍길동2\n".getBytes(), StandardOpenOption.APPEND); // APPEND : 추가모드


    }
}
