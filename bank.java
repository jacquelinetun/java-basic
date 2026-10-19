public class bank {
    
    public static void main(String[] args) {
        
        int withdraw_amount;
        int balance;

        withdraw_amount = 10000;
        balance = 100000;

        if (withdraw_amount <= balance) {
            System.out.println("Success");
            balance = balance - withdraw_amount;
        }else{
            System.out.println("Fail");
        }

        System.out.println("Your balance is " + balance);
    }
}
