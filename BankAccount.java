class BankAccount {
    private int numberOfAccounts;
    private int totalAmount;
    private int checkingBalance;
    private int savingsBalance;

    public BankAccount(){
        numberOfAccounts+=1;
    }

    public String test(){
        return "Hello World!";
    }

    public void deposit(int amount){
        this.checkingBalance += amount;
        totalAmount += amount;
    }

    public void withdraw(int amount){
        if(amount <= this.checkingBalance){
            this.checkingBalance -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public double getTotalBalance(){
        return this.savingsBalance + this.checkingBalance;
    }
}