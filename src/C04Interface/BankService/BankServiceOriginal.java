package C04Interface.BankService;

public class BankServiceOriginal {
    public void deposit(long money, BankAccount ba){
//        현재 잔액 조회
        long current = ba.getBalance();
        long newBalance = current + money;
//        잔액 + money와 합산하여 updateBalance
        ba.updateBalance(newBalance);
    }
    public boolean withdraw(long money, BankAccount ba){
//        잔액 조회 && 출금 금액과 비교
//        int temp = Integer.parseInt(String.valueOf(ba.getBalance()));
//        if (temp>money){
////        그 금액과 + money와 차감하여 updateBalance
//            ba.updateBalance(ba.getBalance()-money);
//            return true;
//        }else {
//            return false;
//        }
        long current = ba.getBalance();
        if (current<money){
            return false;
        }else {
            long newBalance = current + money;
            ba.updateBalance(newBalance);
            return true;
        }


    }

}
