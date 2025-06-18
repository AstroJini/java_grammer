package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2~3개 정도 add
        List<Account> accounts = new ArrayList<>();
        Account a1 = new Account("윤세진","107-112146-02-011",1000000000);
        Account a2 = new Account("홍길동","162-685633-04-211",30000000);
        accounts.add(a1);
        accounts.add(a2);
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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name +
                ", accountNumber='" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}