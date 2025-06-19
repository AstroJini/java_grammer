package C02ClassBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09BankService {
//        계좌개설 및 입출금 서비스 : id(auto_increment), name(String), accountNumber(String), balance(long).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw(출금), transfer(송금) 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : "계좌번호와 현재가지고 계신돈을 입력하세요." -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : "계좌조회서비스입니다." 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : "계좌입금서비스입니다." 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 잔액출력.
//        4.출금 : "계좌출금서비스입니다." 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> "남은 금액은 얼마입니다." 또는 "잔액이 부족합니다." 출력.
//        5.송금 : "송금서비스입니다." 본인의 계좌번호를 입력해주세요. "보내고자 하는 상대방의 계좌번호를 입력해주세요." 송금금액을 입력해주세요.(잔액검증) -> "남은 금액은 얼마입니다." 또는 "잔액이 부족합니다"
/// BankAccount 객체를 담아 둘 자료구조 선언

    public static void main(String[] args) throws IOException {

        List<BankAccount> list = new ArrayList<>();

        while (true){
            System.out.println("원하시는 서비스 번호를 입력하세요");
            System.out.println(" 1.개설 2.조회 3.입금 4.출금 5.송금 6.종료");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")||input.equals("개설")){
                System.out.println("성함을 입력하세요:");
                String name = sc.nextLine();

                System.out.println("계좌번호를 입력하세요:");
                String accNum = sc.nextLine();

                System.out.println("초기 금액을 입력하세요:");
                long money = Long.parseLong(sc.nextLine());

                BankAccount newAcc = new BankAccount(name, accNum, money);
                list.add(newAcc);
                System.out.println("계좌 개설이 완료되었습니다.");
//                break;
            } else if (input.equals("2")||input.equals("조회")) {
                System.out.println("조회하실 계좌번호를 입력하세요:");
                String accNum = sc.nextLine();

                for (BankAccount a : list) {
                    if (accNum.equals(a.getAccountNumber())){
                    System.out.println(a.getName() + "님의 계좌 정보입니다." + "계좌번호 : " + a.getAccountNumber() + " 잔고 : " + a.getBalance());
                    }
                }
//                break;
            } else if (input.equals("3")||input.equals("입금")) {
                boolean found = false;
                System.out.println("계좌입금서비스입니다.");
                System.out.println("입금하실 계좌번호를 입력하세요:");
                String accNum = sc.nextLine();
                System.out.println("입금하실 금액을 입력하세요");
                long money = sc.nextInt();
                for (BankAccount a : list){
                    if (accNum.equals(a.getAccountNumber())) {
                        a.deposit(money);
                        System.out.println("입금 후 현재 잔액은 : " + a.getBalance() + "원 입니다.");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("계좌정보가 없습니다.");
                }
//                break;
            } else if (input.equals("4")||input.equals("출금")) {
                boolean found = false;
                System.out.println("계좌출금서비스입니다.");
                System.out.println("출금하실 계좌번호를 입력하세요:");
                String accNum = sc.nextLine();
                System.out.println("출금하실 금액을 입력하세요");
                long money = sc.nextInt();
                for (BankAccount a : list) {
                    if (accNum.equals(a.getAccountNumber())){
                        a.withdraw(money);
                        System.out.println("출금 후 남은 금액은 : " + a.getBalance() + "원 입니다.");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("계좌정보가 없습니다.");
                }
//                break;
            } else if (input.equals("5")||input.equals("송금")) {
                boolean found = false;
                System.out.println("송금서비스입니다.");
                System.out.println("고객님의 계좌번호를 입력하세요:");
                String accNumFrom = sc.nextLine();
                System.out.println("보내고자 하는 상대방의 계좌번호를 입력하세요:");
                String accNumTo = sc.nextLine();
                System.out.println("송금하실 금액을 입력하세요");
                long money = sc.nextInt();
                for (BankAccount a : list) {
                   for (BankAccount b : list) {
                       if (accNumFrom.equals(a.getAccountNumber())&& accNumTo.equals(b.getAccountNumber())){
                           a.transfer(b, money);
                           System.out.println("송금 후 남은 금액은 : " + a.getBalance() + "원 입니다.");
                           found =true;
                       }
                   }
                }
                if (!found) {
                    System.out.println("계좌정보가 없습니다.");
                }


//                break;
            } else if (input.equals("6")||input.equals("종료")){
                System.out.println("이용해주셔서 감사합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 숫자 또는 서비스이름을 입력해주세요");
            }
//            continue;
        }


    }
}


class BankAccount {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    public void user() {
        this.id = idCounter;
        idCounter++;
    }
    public BankAccount (String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void updateBalance(long balance) {
        this.balance = balance;
    }

//    getter 생성

//    setter 생성 -> 의도를 명확히 한 메서드를 생성 | set이라는 명령보다 update라고 명하는게 의도가 명확해서 좋음
    public void deposit(long money) {
        this.updateBalance(this.getBalance()+money);
    }

    public boolean withdraw(long money) { /// 잔고확인 먼저 출력
//        잔고가 있으면 차감 후 true리턴
        if (this.getBalance()>money) {
            this.updateBalance(this.getBalance()-money);
            return true;
//        잔고가 없으면 false리턴
        } else {
            System.out.println("잔고가 비었습니다.");
            return false;
        }

    }
//    매개변수로 BankAccount 또는 String의 accountNumber 둘 다 가능
    public void transfer(BankAccount targetAccount, long money) {
        if (this.getBalance()>money) {
            this.updateBalance(this.getBalance()-money);
            targetAccount.updateBalance(targetAccount.getBalance()+money);
        } else {
            System.out.println("잔고가 비었습니다.");
        }

    }

}
