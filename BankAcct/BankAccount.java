public class BankAccount {

    private String checking;
    private String saving;
    private double checkingBalance;
    private double savingBalance;
    public static int numberOfAccounts;
    public static double totalAmount;

    public BankAccount() {
        numberOfAccounts++;
    }

    public double getChecking(){
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingBalance;
    }

    public double addMoney(double amount, String account) {
        if (this.checking = account) {
            return this.checkingBalance += amount;
        }
        if (this.saving = account) {
            this.savingBalance +=amount;
        }

    }

}