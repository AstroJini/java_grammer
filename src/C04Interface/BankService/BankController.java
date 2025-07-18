package C04Interface.BankService;

import java.util.Scanner;

//Controller : 사용자와 인터페이스
//Service : 핵심로직 수행
//entity : 상태관리 | 만약 게시물 관련 기능이었다면-> Post객체, Author/Member 객체

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;

        while(true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if (serviceNumber.equals("1")){
                System.out.println("입금방식을 선택해주세요 1.카카오페이 2.토스페이");
                String num = sc.nextLine();
                if (num.equals("1")){
                    bs = new BankKakaoService();
                    System.out.println("입금하실 금액을 입력해주세요");
                    long money= Long.parseLong(sc.nextLine());
                    bs.deposit(money, ba);
                    System.out.println("입금이 완료되었습니다.");
                }else {
                    bs = new BankTossService();
                    System.out.println("입금하실 금액을 입력해주세요");
                    long money= Long.parseLong(sc.nextLine());
                    bs.deposit(money, ba);
                    System.out.println("입금이 완료되었습니다.");

                }
            }else {
                System.out.println("출금방식을 선택해주세요 1.카카오페이 2.토스페이");
                String num = sc.nextLine();
                if (num.equals("1")){
                    bs = new BankKakaoService();
                    System.out.println("출금하실 금액을 입력해주세요");
                    long money= Long.parseLong(sc.nextLine());

                        if(bs.withdraw(money,ba)){
                            System.out.println("출금이 정상처리 되었습니다.");
                        }else {
                            System.out.println("잔액부족으로 출금이 불가합니다.");
                        }
                }else {
                    bs = new BankTossService();
                    System.out.println("출금하실 금액을 입력해주세요");
                    long money= Long.parseLong(sc.nextLine());

                        if(bs.withdraw(money,ba)){
                            System.out.println("출금이 정상처리 되었습니다.");
                        }else {
                            System.out.println("잔액부족으로 출금이 불가합니다.");
                        }
                }


            }
        }

    }
}
