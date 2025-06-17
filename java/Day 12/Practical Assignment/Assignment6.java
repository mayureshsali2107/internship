
//Write a BankAccount class with private fields accountNumber and balance. Add methods to deposit and withdraw money with proper validation.


class BankAccount{
    private int accountNumber =362432;
    private int balance =43721;
    int amount;
    void deposit(int amount){
        System.out.println("Before deposit = "+balance);
        balance=balance+amount;
        System.out.println("Balance After Deposit =" +balance);

    }
    void withdraw(int amount){
        if(balance>=amount){
        System.out.println("Before Withdraw = "+balance);
        balance=balance-amount;
        System.out.println("Balance AfterWithdraw =" +balance);}
        else{
            System.out.println("insufficient Balance");
        }

    }
}
public class Assignment6 {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.deposit(321123);
        b.withdraw(432);
    }
    
}
