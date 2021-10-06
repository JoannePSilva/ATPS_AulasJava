package Aula15.ATP21;

public class Conta {

    private String client_code;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getClient_code() {
        return client_code;
    }

    public void setClient_code(String client_code) {
        this.client_code = client_code;
    }

    public void transfer(double value) {
        this.balance -= value;

    }

}