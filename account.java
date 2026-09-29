public class account {
    double balance;
    account(){
        balance=0;
    }
    account(double intnibalance,double extraBalance){
        balance=intnibalance+extraBalance;
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposit="+amount);
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdraw="+amount);
    }
    void display(){
        System.out.println("Current Balance="+balance);
    }
    public static void main(String[] args){
        account a1=new account();
        a1.deposit(500);
        a1.withdraw(200);
        a1.display();
        account a2=new account(5000,2000);
        a2.deposit(700);
        a2.withdraw(300);
        a2.display();
    }
}
