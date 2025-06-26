package C07ExceptionFileParsing.MemberException;

import java.util.NoSuchElementException;
import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1번:  회원가입, 2번: 회원 상세조회, 3번: 회원 목록조회, 4번: 로그인");
            String input = sc.nextLine();
            if (input.equals("1")) {
//                이름 이메일 패스워드 입력 받아서 service에 전달해서 회원가입
                System.out.println("회원가입 서비스 입니다.");
                try {
                    System.out.println("이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요(8자 이상)");
                    String password = sc.nextLine();
//                    if (password.length()<8){ ///강사님 방식
//                        System.out.println("비밀번호가 너무 짧습니다");
//                    }
//                    try {
//                        memberService.register(name,email,password);
//                    }catch (IllegalArgumentException e){
//                        System.out.println(e.getMessage());
//                    }
                    memberService.register(name, email, password);
                    System.out.println(name + "님, 회원가입에 성공하였습니다.");
//                예외 발생 시 적절한 문구를 사용자에게 출력 (try catch로 예외 찾아서 출력)
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }


            } else if (input.equals("2")) {
//                회원정보를 출력
                System.out.println("회원상세조회 서비스 입니다.");
                try {
                    System.out.println("회원 id를 입력해주세요");
                    Long id = sc.nextLong();
                    System.out.println(memberService.findById(id));
//                적절한 예외처리필요 Optional에 대한 값이 null일 경우의 예외처리
                } catch (NoSuchElementException e) {
                    throw new NoSuchElementException("해당 id의 회원을 찾을 수 없습니다");
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("잘못된 입력방식입니다.");
                }

            } else if (input.equals("3")) {
//                회원 목록출력
                System.out.println("전체회원목록조회 서비스 입니다");
                memberService.findAll();
            } else if (input.equals("4")) {
                System.out.println("로그인 화면입니다.");
                try {
                    System.out.println("id를 입력해주세요");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String password = sc.nextLine();
                    memberService.login(email, password);
                    System.out.println("로그인 성공입니다.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
