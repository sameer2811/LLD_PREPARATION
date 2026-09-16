package ChainOfResponsibilityDesignPattern.CashDenomination.interfaces;

import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public interface CashDispenseHandler {

    public void setNext(CashDispenseHandler next);

    boolean handleCashDispenseRequest(CashRequest cashRequest);
}
