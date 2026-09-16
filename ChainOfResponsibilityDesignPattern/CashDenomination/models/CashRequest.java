package ChainOfResponsibilityDesignPattern.CashDenomination.models;

public class CashRequest {

    private int amount;

    public CashRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}