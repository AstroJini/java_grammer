package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2~3개 정도 add
        List<Account> accounts = new ArrayList<>();
        Account a1 = new Account("윤세진","107-112146-02-011",100000);
        Account a2 = new Account("홍길동","162-685633-04-211",300000);
        accounts.add(a1);
        accounts.add(a2);

        for (Account a : accounts) {
            System.out.println(a.getAccountNumber());
        }



//        사용자 1이 사용자 2에게 송금 (50000)
        for (Account a : accounts){
            if (a.getAccountNumber().equals("107-112146-02-011")){
                a.setBalance(a.getBalance()-50000);
            }
            if (a.getAccountNumber().equals("162-685633-04-211")){
                a.setBalance(a.getBalance()+50000);
            }
        }

//        계좌 상세조회 : 계좌번호와 잔고 조회
        for (Account a : accounts) {
            System.out.println("계좌번호 : " + a.getAccountNumber() + " 잔고 : " + a.getBalance());
        }

//        Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
//        계좌 개설
        accountMap.put("107-112146-02-011", new Account("윤세진", "107-112146-02-011", 100000));
        accountMap.put("162-685633-04-211", new Account("hong1", "162-685633-04-211", 100000));
//        송금
        Account a = accountMap.get("107-112146-02-011");
        Account b = accountMap.get("162-685633-04-211");
        a.setBalance(a.getBalance()-50000);
        b.setBalance(b.getBalance()+50000);
//        계좌 조회
        for (String ac : accountMap.keySet()){
            System.out.println(accountMap.get(ac).getAccountNumber());
        }



    }


}
//Account 클래스| 계좌주명(name-String), 계좌번호(accountNumber-String), 잔고(balance-long)
class Account{
    private String name;
    private String accountNumber;
    private long balance;

    public Account (String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

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

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name +
                ", accountNumber='" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}