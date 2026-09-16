package ChainOfResponsibilityDesignPattern.CashDenomination.handlers;

import ChainOfResponsibilityDesignPattern.CashDenomination.interfaces.CashDispenseHandler;
import ChainOfResponsibilityDesignPattern.CashDenomination.models.CashRequest;

public abstract class BaseDenominationHandler implements CashDispenseHandler {
    protected CashDispenseHandler next;

    @Override
    public void setNext(CashDispenseHandler next) {
        this.next = next;
    }

    public boolean forwardToNextAvailableDenomination(CashRequest cashRequest) {
        if (this.next == null) {
            return cashRequest.getAmount() == 0;
        }
        return this.next.handleCashDispenseRequest(cashRequest);
    }
}
