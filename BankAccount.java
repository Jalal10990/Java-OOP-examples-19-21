class BankAccount{

    private String depositorName;
    private long accountNumber;
    private String accountType;
    private double balance;

    BankAccount(String depositorName, long accountNumber, String accountType, double balance){
        this.depositorName=depositorName;
        this.accountNumber= accountNumber;
        this.accountType = accountType;
        this.balance = balance;

    }
     //b) Deposit function to deposit some amount. It should accept the amount as parameter

     public  void deposit(double amount){
        if (amount > 0){
balance += amount;
System.out.println("depposit monney is done. new balance is this: "+ balance);

        }else{
            System.out.println("deposit amount is invalid.");
        }
     }
     //c) Withdraw function to withdraw an amount after checking the balance. It should accept the amount as parameter.

public void withdraw(double amount){
    if(amount > 0 && amount <= balance){
        balance -= amount;
        System.out.println("successful withdraw process.now new balance is this. "+ balance);

    }else{
        System.out.println("balance is Insufficient  or withdrawal amount is invalid .");
    }

}
//Display function to display name and balance.

public void display(){
    System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Balance: " + balance);
}

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Shah Jalal", 1903452189, "investing", 9000.0);

        account.display();

        account.deposit(500.0);

        account.withdraw(200.0);

        account.display();


    }
}