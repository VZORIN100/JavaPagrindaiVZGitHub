public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        //write code here.
        this.balance = openingBalance;
    }

    public String toString() {
        //double openingBalance = 50;
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        //balance = this.balance - 2.60;
        if (this.balance >= 2.60) {
            balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        //balance = this.balance - 4.60;
        if (this.balance >= 4.60) {
            balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        //if (balance <= 150.0) {
        //balance = this.balance + amount;
        //}
        balance = Math.min(this.balance + amount, 150);

    }

}
