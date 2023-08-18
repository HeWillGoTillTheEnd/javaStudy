package thisisjavachapter6;

public class Account {

    private String accountNum;
    private String name;
    private int deposit;

    public Account(String accountNum, String name, int firstDeposit) {
        this.accountNum = accountNum;
        this.name = name;
        this.deposit = firstDeposit;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
