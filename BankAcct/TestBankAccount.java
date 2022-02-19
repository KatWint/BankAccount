public class TestBankAccount {
    
    public static void main(String[] args) {
        BankAccount sam = new BankAccount();
        BankAccount suzie = new BankAccount();

        sam.addMoney(250, checking);

        System.out.pringln(sam.getChecking());
    }
}
